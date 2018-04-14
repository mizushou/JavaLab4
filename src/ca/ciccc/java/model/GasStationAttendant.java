package ca.ciccc.java.model;

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	private double numberOfDollarsStolenPerDay;

	private final String VERB = "pump";
	private final double OVERTIME_PAY_RATE = 1.5;

	public GasStationAttendant() {
	}

	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
		super(name);
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.UNIFORM;
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
	public int compareTo(GasStationAttendant o) {
		return (int) (this.numberOfDollarsStolenPerDay - o.numberOfDollarsStolenPerDay);
	}

	public double getNumberOfDollarsStolenPerDay() {
		return numberOfDollarsStolenPerDay;
	}

	public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

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

}
