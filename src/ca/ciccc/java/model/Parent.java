package ca.ciccc.java.model;

public class Parent extends Employee {
	
	int numberOfHoursSpentPerWeekWithKids;
	
	private final String VERB = "care";
	private final double OVERTIME_PAY_RATE = -2.0;
	
	public Parent() {
	}
	
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
		super(name);
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}
	
	@Override
	public DressCode getDressCode() {
		return null;
	}

	@Override
	public boolean isPaidSalary() {
		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
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
