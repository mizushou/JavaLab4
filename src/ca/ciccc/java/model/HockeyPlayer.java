package ca.ciccc.java.model;

/**
 *
 * This class represents HockeyPlayer.<br>
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * <li>numberOfGoals</li>
 * </ul>
 *
 * @since 2018-04-13
 * @author shouhei
 *
 */

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

	private int numberOfGoals;

	private final String VERB = "play";
	private final double OVERTIME_PAY_RATE = 0.0;

	/**
	 * Default constructor.
	 */
	public HockeyPlayer() {
	}

	/**
	 * Constructs a new HockeyPlayer object by setting initial values in
	 * specified values.<br>
	 * 
	 * @param name
	 *            name
	 * @param numberOfGoals
	 *            number of goals
	 */
	public HockeyPlayer(String name, int numberOfGoals) {
		super(name);
		this.numberOfGoals = numberOfGoals;
	}

	/**
	 * Getter of DressCode
	 */
	@Override
	public DressCode getDressCode() {
		return DressCode.JERSEY;
	}

	/**
	 * Getter of paidSalary
	 */
	@Override
	public boolean isPaidSalary() {
		return true;
	}

	/**
	 * Getter of SecondaryEducationRequired.
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
	 * Create hash code.
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * numberOfGoals;
		return result;
	}

	/**
	 * Compare by number of goals.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof HockeyPlayer))
			return false;
		HockeyPlayer objHp = (HockeyPlayer) obj;
		if (this.getNumberOfGoals() == objHp.getNumberOfGoals()) {
			return true;
		}
		return false;
	}

	/**
	 * Compare by number of goals.
	 */
	@Override
	public int compareTo(HockeyPlayer o) {
		return this.numberOfGoals - o.numberOfGoals;
	}

	/**
	 * Getter of number of goals.
	 * 
	 * @return number of goals
	 */
	public int getNumberOfGoals() {
		return numberOfGoals;
	}

	/**
	 * Setter of number of goals.
	 * 
	 * @param numberOfGoals
	 *            number of goals
	 */
	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}

	@Override
	public String toString() {
		return "HockeyPlayer Class [name] : " + getName() + ", [goals] : " + getNumberOfGoals();
	}

}
