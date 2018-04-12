package ca.ciccc.java.model;

public abstract class Employee implements Employable {
	
	String name;
		
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	
	abstract public double getOverTimePayRate();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
