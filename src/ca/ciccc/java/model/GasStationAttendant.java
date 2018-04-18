package ca.ciccc.java.model;

/**
 *
 * This class represents GasStationAttendant.<br>
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * <li>numberOfDollarsStolenPerDay</li>
 * </ul>
 *
 * @since 2018-04-13
 * @author shouhei
 *
 */

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	private double numberOfDollarsStolenPerDay;

	private final String VERB = "pump";
	private final double OVERTIME_PAY_RATE = 1.5;

	/**
	 * Default constructor.
	 */
	public GasStationAttendant() {
	}

	/**
	 * Constructs a new GasStationAttendant object by setting initial values in
	 * specified values.<br>
	 * 
	 * @param name
	 *            name
	 * @param numberOfDollarsStolenPerDay
	 *            number of dollars stolen per day
	 */
	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
		super(name);
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	/**
	 * Getter of DressCode
	 */
	@Override
	public DressCode getDressCode() {
		return DressCode.UNIFORM;
	}

	/**
	 * Getter of paidSalary
	 */
	@Override
	public boolean isPaidSalary() {
		return false;
	}

	/**
	 * Getter of SecondaryEducationRequired.
	 * 
	 * @return requirement of Secondary Education
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
	 * Compare by number of dollars stolen per day.
	 */
	@Override
	public int compareTo(GasStationAttendant o) {
		return (int) (this.numberOfDollarsStolenPerDay - o.numberOfDollarsStolenPerDay);
	}

	/**
	 * Getter of NumberOfDollarsStolenPerDay
	 * 
	 * @return number of dollars stolen per day
	 */
	public double getNumberOfDollarsStolenPerDay() {
		return numberOfDollarsStolenPerDay;
	}

	/**
	 * Setter of NumberOfDollarsStolenPerDay
	 * 
	 * @param numberOfDollarsStolenPerDay
	 *            number of dollars stolen per day
	 */
	public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	/**
	 * Create hash code.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/**
	 * Compare by dollars stolen per day.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof GasStationAttendant))
			return false;
		GasStationAttendant objGsa = (GasStationAttendant) obj;
		if (Double.doubleToLongBits(numberOfDollarsStolenPerDay) != Double
				.doubleToLongBits(objGsa.numberOfDollarsStolenPerDay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GasStaionAttendant Class [name] : " + getName() + ", [dollars Stolen] : "
				+ getNumberOfDollarsStolenPerDay();
	}

}
