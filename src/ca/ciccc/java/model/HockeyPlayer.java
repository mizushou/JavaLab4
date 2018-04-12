package ca.ciccc.java.model;

public class HockeyPlayer extends Employee {

	int numberOfGoals;

	private final String VERB = "play";
	private final double OVERTIME_PAY_RATE = 0.0;

	public HockeyPlayer() {
	}

	public HockeyPlayer(String name, int numberOfGoals) {
		super(name);
		this.numberOfGoals = numberOfGoals;
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
