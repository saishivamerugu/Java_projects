package CarRetalSystem;

public class Customer {

	private String name;
	private String liscence;
	
	public Customer() {
		
	}
	
	public Customer(String name, String liscence) {
		this.name = name;
		this.liscence = liscence;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLiscence() {
		return liscence;
	}
	public void setLiscence(String liscence) {
		this.liscence = liscence;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", liscence=" + liscence + "]";
	}
}
