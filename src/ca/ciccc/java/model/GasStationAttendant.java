package ca.ciccc.java.model;

public class GasStationAttendant extends Employee {
	
	double numberOfDollarsStolenPerDay;
	
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
		return null;
	}
	
	@Override
	public boolean isPaidSalary()	 {
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
