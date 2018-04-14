package ca.ciccc.java.model;

/**
 * 
 * This class represents Parent.<br>
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * <li>numberOfHoursSpentPerWeekWithKids</li>
 * </ul>
 * 
 * @since 2018-04-13
 * @author mizushou
 *
 */
public class Parent extends Employee implements Comparable<Parent> {

	private int numberOfHoursSpentPerWeekWithKids;

	private final String VERB = "care";
	private final double OVERTIME_PAY_RATE = -2.0;

	/**
	 * Default constructor.
	 */
	public Parent() {
	}

	/**
	 * Constructs a new Parent object by setting initial values in specified
	 * values.<br>
	 * 
	 * @param name
	 *            name
	 * @param numberOfHoursSpentPerWeekWithKids
	 *            number of hours spent per week with kids
	 */
	public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
		super(name);
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	/**
	 * Getter of DressCode
	 */
	@Override
	public DressCode getDressCode() {
		return DressCode.ANYTHING;
	}

	/**
	 * Getter of paidSalary
	 */
	@Override
	public boolean isPaidSalary() {
		return false;
	}

	/**
	 * 
	 */
	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	/**
	 * Getter of verb.
	 */
	@Override
	public String getWorkVerb() {
		return VERB;
	}

	/**
	 * Getter of overtime pay rate.
	 * 
	 * @return overtime pay rate
	 */
	@Override
	public double getOverTimePayRate() {
		return OVERTIME_PAY_RATE;
	}

	/**
	 * Compare by number of hours spent per week with kids.
	 */
	@Override
	public int compareTo(Parent o) {
		return this.numberOfHoursSpentPerWeekWithKids - o.numberOfHoursSpentPerWeekWithKids;
	}

	/**
	 * Getter of numberOfHoursSpentPerWeekWithKids.
	 * @return numberOfHoursSpentPerWeekWithKids
	 */
	public int getNumberOfHoursSpentPerWeekWithKids() {
		return numberOfHoursSpentPerWeekWithKids;
	}

	/**
	 * Setter of numberOfHoursSpentPerWeekWithKids.
	 * @param numberOfHoursSpentPerWeekWithKids
	 */
	public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
		return result;
	}

	/**
	 * Compare by numberOfHoursSpentPerWeekWithKids.
	 */
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
