package com;


public class Travel {

	Driver[] driver;
	
	public boolean isCarDriver(Driver driver) {
		if(driver.getDriverCategorey().equalsIgnoreCase("car")) {
			return true;
		}
		else {
			return false;
		}   
	}
	
	public String retrieveByDriverId(Driver[] driver,int id) {
	    for(int i=0;i<driver.length;i++) {
	    	if(driver[i].getId()==id) {
	    		return "Driver name is " +driver[i].getName()+
	                       " Belonging to the category " +driver[i].getDriverCategorey()+
	                       " traveled " +driver[i].getTotalDistanceTravelled()+ " KM so far.";
	          }
	    }
		return "No Driver found with the Id : "+id;
	}
	
	public int retriveCountOfDriver(Driver[] driver,String category) {
		int count=0;
		for(int i=0;i<driver.length;i++){
			if(driver[i].getDriverCategorey()==category) {
				count++;
			}
			else {
				System.out.println("No driver found with this category : "+category);
			}
		}
		return count;
	}
	
	public Driver[] retriveDriver(Driver[] driver, String category) {
	    int count=0;
	    for (int i=0;i<driver.length;i++) {
	        if (driver[i].getDriverCategorey().equalsIgnoreCase(category)) {
	            count++;
	        }
	    }
	    if (count==0) {
	        System.out.println("No Driver Found with category: " + category);
	        return new Driver[0];
	    }
	    Driver[] driverCategory=new Driver[count];
	    int index = 0;
	    for (int i=0;i<driver.length;i++) {
	        if (driver[i].getDriverCategorey().equalsIgnoreCase(category)) {
	            driverCategory[index++]=driver[i];
	        }
	    }
	    return driverCategory;
	}

	
	public String retriveeMaximumDistanceTravelledDriver(Driver[] driver) {
		Driver maxDriver=driver[0];
		for(int i=1;i<driver.length;i++) {
			if(driver[i].getTotalDistanceTravelled()>maxDriver.getTotalDistanceTravelled()) {
				maxDriver=driver[i];
			}
		}
		return maxDriver.getName();
	}
}
