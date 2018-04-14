package ca.ciccc.java.model;

/**
 * 
 * Employee is a abstract class. This is a superclass of HockyePlayer,
 * Professor, Parent, GasStationAttendant.<br>
 * It has attributes below.
 * <ul>
 * <li>name</li>
 * </ul>
 * 
 * @since 2018-04-13
 * @author mizushou
 *
 */

public abstract class Employee implements Employable {

	String name;

	/**
	 * Default constructor.
	 */
	public Employee() {
	}

	/**
	 * Constructs a new Employee object by setting initial values in specified
	 * values.<br>
	 * 
	 * @param name
	 *            name
	 */
	public Employee(String name) {
		this.name = name;
	}

	/**
	 * Getter of overtime pay rate.
	 * 
	 * @return overtime pay rate
	 */
	abstract public double getOverTimePayRate();

	/**
	 * Getter of name;
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
