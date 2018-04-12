package ca.ciccc.java.model;

public class Parent extends Employee implements Comparable<Parent> {
	
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
		return DressCode.ANYTHING;
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
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int compareTo(Parent o) {
		return this.numberOfHoursSpentPerWeekWithKids - o.numberOfHoursSpentPerWeekWithKids;
	}
}
