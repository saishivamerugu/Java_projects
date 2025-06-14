package com;

public class Driver {

	private int id;
	private String driverName;
	private String driverCategorey;
	private double totalDistanceTravelled;
	
	public Driver() {
		
	}
	
	public Driver(int id, String driverName, String driverCategorey, double totalDistanceTravelled) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.driverCategorey = driverCategorey;
		this.totalDistanceTravelled = totalDistanceTravelled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return driverName;
	}

	public void setName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverCategorey() {
		return driverCategorey;
	}

	public void setDriverCategorey(String driverCategorey) {
		this.driverCategorey = driverCategorey;
	}

	public double getTotalDistanceTravelled() {
		return totalDistanceTravelled;
	}

	public void setTotalDistanceTravelled(double totalDistanceTravelled) {
		this.totalDistanceTravelled = totalDistanceTravelled;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" +driverName + ", driverCategorey=" + driverCategorey
				+ ", totalDistanceTravelled=" + totalDistanceTravelled + "]";
	}
}
