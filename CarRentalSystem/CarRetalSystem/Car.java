package CarRetalSystem;

public class Car {

	private String brand;
	private String model;
	private String vehicleNumber;
	
	public Car() {
	}
	
	public Car(String brand, String model, String vehicleNumber) {
		this.brand = brand;
		this.model = model;
		this.vehicleNumber= vehicleNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getvehicleNumber() {
		return vehicleNumber;
	}

	public void setvehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", vehicleNumber=" + vehicleNumber + "]";
	}
	
	
	
}
