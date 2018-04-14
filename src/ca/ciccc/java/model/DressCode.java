package ca.ciccc.java.model;

public enum DressCode {
	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	private String dress;

	private DressCode(String dress) {
		this.dress = dress;
	}

	public String getDetail() {
		return dress;
	}
}
