package ca.ciccc.java.model;

public class Professor extends Employee implements Comparable<Professor> {

	private String teachingMajor;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor objPf = (Professor) obj;
		if (teachingMajor == null) {
			if (objPf.teachingMajor != null)
				return false;
		} else if (!teachingMajor.equals(objPf.teachingMajor))
			return false;
		return true;
	}

	@Override
	public int compareTo(Professor o) {
		// same major
		if (this.teachingMajor.equals(o.teachingMajor)) {
			return 0;
		}
		// one is CS vs another is Not CS 
		if ((this.teachingMajor.equals("Computer Systems") && !o.teachingMajor.equals("Computer Systems"))) {
			return 1;
		}
		// one is Not CS vs another is CS
		if ((!this.teachingMajor.equals("Computer Systems") && o.teachingMajor.equals("Computer Systems"))) {
			return -1;
		}
		// one is Not CS vs another is Not CS, not same each other
		return 0;
	}

	public String getTeachingMajor() {
		return teachingMajor;
	}

	public void setTeachingMajor(String teachingMajor) {
		this.teachingMajor = teachingMajor;
	}
	
	
	
}
