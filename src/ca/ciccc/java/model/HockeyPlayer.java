package ca.ciccc.java.model;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

	private int numberOfGoals;

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

	@Override
	public int compareTo(HockeyPlayer o) {
		return this.numberOfGoals - o.numberOfGoals;
	}

	public int getNumberOfGoals() {
		return numberOfGoals;
	}

	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}

}
