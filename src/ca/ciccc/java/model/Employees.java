package ca.ciccc.java.model;

import java.util.ArrayList;

public class Employees {
	
	private ArrayList<HockeyPlayer> hpArry;
	private ArrayList<Professor> pfArry;
	private ArrayList<Parent> pArry;
	private ArrayList<GasStationAttendant> gsaArry;
	
	public Employees() {
		ArrayList<HockeyPlayer> hpArry = new ArrayList<HockeyPlayer>();
		ArrayList<Professor> pfArry = new ArrayList<Professor>();
		ArrayList<Parent> pArry = new ArrayList<Parent>();
		ArrayList<GasStationAttendant> gsaArry = new ArrayList<GasStationAttendant>();

		// HockyePlayer
		hpArry.add(new HockeyPlayer("Wayne Gretzky", 894));
		hpArry.add(new HockeyPlayer("Who Ever", 0));
		hpArry.add(new HockeyPlayer("Brent Gretzky", 1));
		hpArry.add(new HockeyPlayer("Pavel Bure", 437));
		hpArry.add(new HockeyPlayer("Jason Bourne", 0));
		
		// Professor
		pfArry.add(new Professor("Albert Einstein", "Physics"));
		pfArry.add(new Professor("Alan Turing", "Computer Systems"));
		pfArry.add(new Professor("Richard Feynman", "Physics"));
		pfArry.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		pfArry.add(new Professor("Kurt Godel", "Logic"));
		
		// Parent
		pArry.add(new Parent("Tiger Woods", 1));
		pArry.add(new Parent("Super Mom", 168));
		pArry.add(new Parent("Lazy Larry", 20));
		pArry.add(new Parent("Ex Hausted", 168));
		pArry.add(new Parent("Super Dad", 167));

		// GasStationAttend
		gsaArry.add(new GasStationAttendant("Joe Smith", 10));
		gsaArry.add(new GasStationAttendant("Tony Baloney", 100));
		gsaArry.add(new GasStationAttendant("Benjamin Franklin", 100));
		gsaArry.add(new GasStationAttendant("Mary Fairy", 101));
		gsaArry.add(new GasStationAttendant("Bee See	", 1));		
	}

	public ArrayList<HockeyPlayer> getHpArry() {
		return hpArry;
	}

	public void setHpArry(ArrayList<HockeyPlayer> hpArry) {
		this.hpArry = hpArry;
	}

	public ArrayList<Professor> getPfArry() {
		return pfArry;
	}

	public void setPfArry(ArrayList<Professor> pfArry) {
		this.pfArry = pfArry;
	}

	public ArrayList<Parent> getpArry() {
		return pArry;
	}

	public void setpArry(ArrayList<Parent> pArry) {
		this.pArry = pArry;
	}

	public ArrayList<GasStationAttendant> getGsaArry() {
		return gsaArry;
	}

	public void setGsaArry(ArrayList<GasStationAttendant> gsaArry) {
		this.gsaArry = gsaArry;
	}
	
	
	

	

}
