package ca.ciccc.java.model;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

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
		return DressCode.JERSEY;
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

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int compareTo(HockeyPlayer o) {
		return this.numberOfGoals - o.numberOfGoals;
	}

}
