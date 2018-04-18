package ca.ciccc.java.model;

/**
 * 
 * This class represents Professor.<br>
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * <li>teachingMajor</li>
 * </ul>
 * 
 * @since 2018-04-13
 * @author mizushou
 *
 */

public class Professor extends Employee implements Comparable<Professor> {

	private String teachingMajor;

	private final String VERB = "teach";
	private final double OVERTIME_PAY_RATE = 2.0;

	/**
	 * Default constructor.
	 */
	public Professor() {
	}

	/**
	 * Constructs a new Professor object by setting initial values in specified
	 * values.<br>
	 * 
	 * @param name
	 *            name
	 * @param teachingMajor
	 *            teaching major
	 */
	public Professor(String name, String teachingMajor) {
		super(name);
		this.teachingMajor = teachingMajor;
	}

	/**
	 * Getter of DressCode
	 */
	@Override
	public DressCode getDressCode() {
		return DressCode.FANCY;
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
	 * 
	 * @return requirement of Secondary Education
	 */
	@Override
	public boolean postSecondaryEducationRequired() {
		return true;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	/**
	 * Compare by number of teaching major.
	 */
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

	/**
	 * Compare by teaching major. Computer Science is considered highest. Others
	 * are equal.
	 */
	@Override
	public int compareTo(Professor o) {
		// same major
		if (this.teachingMajor.equals(o.teachingMajor)) {
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

	/**
	 * Getter of teachingMajor
	 * 
	 * @return teaching major
	 */
	public String getTeachingMajor() {
		return teachingMajor;
	}

	/**
	 * Setter of teachingMajor
	 * 
	 * @param teachingMajor
	 *            teaching major
	 */
	public void setTeachingMajor(String teachingMajor) {
		this.teachingMajor = teachingMajor;
	}

	@Override
	public String toString() {
		return "Professor Class [name] : " + getName() + ", [Teaching major] : " + getTeachingMajor();
	}

}
