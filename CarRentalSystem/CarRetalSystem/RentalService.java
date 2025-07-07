package CarRetalSystem;

public class RentalService {

	private Car car;
	private Customer customer;
	private int noOfDays;
	private String startDay;
	private String EndDate;
	
	
	public RentalService() {
		
	}
	
	public RentalService(Car car, Customer customer, int noOfDays, String startDay, String endDate) {
		this.car = car;
		this.customer = customer;
		this.noOfDays = noOfDays;
		this.startDay = startDay;
		EndDate = endDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getStartDay() {
		return startDay;
	}

	public void setStartDay(String startDay) {
		this.startDay = startDay;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	@Override
	public String toString() {
		return "RentalService [car=" + car + ", customer=" + customer + ", noOfDays=" + noOfDays + ", startDay="
				+ startDay + ", EndDate=" + EndDate + "]";
	}
	
	public int calculateRent(int rentPerDay) {
		return noOfDays*rentPerDay;
	}
	
}
