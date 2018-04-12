package ca.ciccc.java.model;

public class Professor extends Employee {
	
	String teachingMajor;
	
	private final String VERB = "teach";
	private final double OVERTIME_PAY_RATE = 2.0;
	
	public Professor() {
	}
	
	public Professor(String name, String teachingMajor) {
		super(name);
		this.teachingMajor = teachingMajor;
	}
	
	@Override
	public DressCode getDressCode() {
		return null;
	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return true;
	}

	@Override
	public String getWorkVerb() {
		return VERB;
	}

	@Override
	public double getOverTimePayRate() {
		return OVERTIME_PAY_RATE;
	}

}
