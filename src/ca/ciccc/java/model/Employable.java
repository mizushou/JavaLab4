package ca.ciccc.java.model;

/**
 * 
 * Employable is a interface. This interface is implemented by Employee class.
 * 
 * @since 2018-04-13
 * @author mizushou
 *
 */

public interface Employable {

	/**
	 * Getter of DressCode
	 * 
	 * @return dress
	 */
	public DressCode getDressCode();

	/**
	 * Getter of paidSalary
	 * 
	 * @return payment of salary
	 */
	public boolean isPaidSalary();

	/**
	 * Getter of SecondaryEducationRequired.
	 * 
	 * @return requirement of Secondary Education
	 */
	public boolean postSecondaryEducationRequired();

	/**
	 * Getter of verb.
	 * 
	 * @return verb
	 */
	public String getWorkVerb();

}
