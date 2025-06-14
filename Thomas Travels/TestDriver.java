package com;

public class TestDriver {
	
	public static void main(String[] args) {
		
		Driver[] drivers = new Driver[4];  

		drivers[0] = new Driver(1,"Mani","Car",1500.5);  
		drivers[1] = new Driver(2,"Shankar","Truck",2001.0);
		drivers[2] = new Driver(3,"Mohan","Car",1200.75);
		drivers[3] = new Driver(4,"Rakesh","Auto",800.25);
		
		Travel travel=new Travel();
		
		//1st for checking whether the driver is car driver
		boolean isCarDriver = travel.isCarDriver(drivers[0]);
		System.out.println(drivers[0] + (isCarDriver ? " is a Car driver." : " is not a Car driver."));

		//2nd Retrieving the Driver by id
		String driverName=travel.retrieveByDriverId(drivers, 4);
		System.out.println(driverName);
		
		//3rd Retrieve count of driver by category
		int count=travel.retriveCountOfDriver(drivers, "Truck");
		System.out.println(count+" Are the total no of Drivers");
		
		// 4th Retrieve all drivers of a given category
		Driver[] carDrivers= travel.retriveDriver(drivers, "Car");
		System.out.println("Drivers in 'Car' category are : ");
		for (int i=0;i<carDrivers.length;i++) {
		    if (carDrivers[i] !=null) {  
		        System.out.println(carDrivers[i].getName()+ " "+carDrivers[i].getDriverCategorey() 
		            + " " +carDrivers[i].getTotalDistanceTravelled()+ " km");
		    }
		}
		
	    // 5th Retrieve the driver who has traveled the maximum distance
	    String topDriver = travel.retriveeMaximumDistanceTravelledDriver(drivers);
	    System.out.println("Driver who traveled the maximum distance is : " + topDriver);
		
	    
	    //printing the all the drivers
	    System.out.println("All drivers:");
	    for (int i=0;i<drivers.length;i++) {
	        System.out.println(drivers[i]);
	    }

	}
}
