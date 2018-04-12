package ca.ciccc.java.model;

public class Professor extends Employee implements Comparable<Professor> {

	String teachingMajor;

	private final String VERB = "teach";
	private final double OVERTIME_PAY_RATE = 2.0;

	public Professor() {
	}

	public Professor(String name, String teachingMajor) {
		super(name);
		this.teachingMajor = teachingMajor;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.FANCY;
	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return true;
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
	public int compareTo(Professor o) {
		// same major
		if (this.teachingMajor == o.teachingMajor) {
			return 0;
		}
		// one is CS vs another is Not CS 
		if ((this.teachingMajor.equals("Computer Science") && !o.teachingMajor.equals("Computer Science"))) {
			return 1;
		}
		// one is Not CS vs another is CS
		if ((!this.teachingMajor.equals("Computer Science") && o.teachingMajor.equals("Computer Science"))) {
			return -1;
		}
		// one is Not CS vs another is Not CS, not same each other
		return 0;
	}

}
