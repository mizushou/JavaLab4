package ca.ciccc.java.model;

/**
 * This class is enum. This holds dresses.
 * 
 * @since 2018-04-13
 * @author mizushou
 *
 */
public enum DressCode {
	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	private String dress;

	/**
	 * Constructs a new enum object by setting initial values in specified
	 * values.<br>
	 * 
	 * @param dress
	 *            dress
	 */
	private DressCode(String dress) {
		this.dress = dress;
	}

	/**
	 * Getter of dress
	 * 
	 * @return dress
	 */
	public String getDetail() {
		return dress;
	}
}
