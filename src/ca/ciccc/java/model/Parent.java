package ca.ciccc.java.model;

public class Parent extends Employee implements Comparable<Parent> {

	private int numberOfHoursSpentPerWeekWithKids;

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
	public int compareTo(Parent o) {
		return this.numberOfHoursSpentPerWeekWithKids - o.numberOfHoursSpentPerWeekWithKids;
	}

	public int getNumberOfHoursSpentPerWeekWithKids() {
		return numberOfHoursSpentPerWeekWithKids;
	}

	public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Parent))
			return false;
		Parent other = (Parent) obj;
		if (numberOfHoursSpentPerWeekWithKids != other.numberOfHoursSpentPerWeekWithKids)
			return false;
		return true;
	}

}
