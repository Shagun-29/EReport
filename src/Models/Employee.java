package Models;

public class Employee {
	protected int id;
	protected String firstName;
	protected String lastName;
	
	public Employee(int id, String fname, String lname) {
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}
