package COMP1451.lab08a.data;

public abstract class Employee {

	private String firstName;
	private String lastName;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
