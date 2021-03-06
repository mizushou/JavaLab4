package ca.ciccc.java.model;

import java.util.ArrayList;

/**
 * This class contain each Employee's ArrayList. These are [Hockey Player],
 * [Professor], [Parent], [Gas station attendant]
 * 
 * @since 2018-04-13
 * @author mizushou
 *
 */

public class Employees {

	private ArrayList<HockeyPlayer> hpArry;
	private ArrayList<Professor> pfArry;
	private ArrayList<Parent> pArry;
	private ArrayList<GasStationAttendant> gsaArry;

	/**
	 * Default constructor.
	 */
	public Employees() {
		hpArry = new ArrayList<HockeyPlayer>();
		pfArry = new ArrayList<Professor>();
		pArry = new ArrayList<Parent>();
		gsaArry = new ArrayList<GasStationAttendant>();

		// HockyePlayer
		hpArry.add(new HockeyPlayer("Wayne Gretzky", 894));
		hpArry.add(new HockeyPlayer("Who Ever", 0));
		hpArry.add(new HockeyPlayer("Brent Gretzky", 1));
		hpArry.add(new HockeyPlayer("Pavel Bure", 437));
		hpArry.add(new HockeyPlayer("Jason Bourne", 0));

		// Professor
		pfArry.add(new Professor("Albert Einstein", "Physics"));
		pfArry.add(new Professor("Alan Turing", "Computer Science"));
		pfArry.add(new Professor("Richard Feynman", "Physics"));
		pfArry.add(new Professor("Tim Berners-Lee", "Computer Science"));
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
		gsaArry.add(new GasStationAttendant("Bee See", 1));
	}

	/**
	 * Display all information on Employee held by this class.
	 * 
	 * @param hpArry
	 *            ArrayList of Hockey Player.
	 * @param pfArry
	 *            ArrayList of Professor.
	 * @param pArry
	 *            ArrayList of Parent.
	 * @param gsaArry
	 *            ArrayList of Gas Station .
	 */
	public void display(ArrayList<HockeyPlayer> hpArry, ArrayList<Professor> pfArry, ArrayList<Parent> pArry,
			ArrayList<GasStationAttendant> gsaArry) {
		displayHockeyPlayer(hpArry);
		System.out.println();
		displayProfessor(pfArry);
		System.out.println();
		displayParent(pArry);
		System.out.println();
		displayGasStationAttendant(gsaArry);
	}

	private void displayHockeyPlayer(ArrayList<HockeyPlayer> hpArry) {
		for (HockeyPlayer hp : hpArry) {
			String output = String.format("|%-20s|%-20s|%s %d %-20s%n", "HockeyPlayer", hp.getName(), "scored",
					hp.getNumberOfGoals(), "goals");
			System.out.printf(output);
		}
	}

	private void displayProfessor(ArrayList<Professor> pfArry) {
		for (Professor pf : pfArry) {
			String output = String.format("|%-20s|%-20s|%s %s%n", "Professor", pf.getName(), "teaches",
					pf.getTeachingMajor());
			System.out.printf(output);
		}
	}

	private void displayParent(ArrayList<Parent> pArry) {
		for (Parent p : pArry) {
			String output = String.format("|%-20s|%-20s|%s %s%n", "Parent", p.getName(), "teaches",
					p.getNumberOfHoursSpentPerWeekWithKids());
			System.out.printf(output);
		}
	}

	private void displayGasStationAttendant(ArrayList<GasStationAttendant> gsaArry) {
		for (GasStationAttendant gsa : gsaArry) {
			String output = String.format("|%-20s|%-20s|%s %d %-20s%n", "GasStationAttendant", gsa.getName(), "steals",
					(int) gsa.getNumberOfDollarsStolenPerDay(), "dollars a day");
			System.out.printf(output);

		}
	}

	/**
	 * Getter of HpArry
	 * 
	 * @return HpArry
	 */
	public ArrayList<HockeyPlayer> getHpArry() {
		return hpArry;
	}

	/**
	 * Setter of HpArry
	 * 
	 * @param hpArry
	 *            ArrayList of HockyePlayer
	 */
	public void setHpArry(ArrayList<HockeyPlayer> hpArry) {
		this.hpArry = hpArry;
	}

	/**
	 * Getter of HpArry
	 * 
	 * @return HpArry
	 */
	public ArrayList<Professor> getPfArry() {
		return pfArry;
	}

	/**
	 * Setter of PfArry
	 * 
	 * @param pfArry
	 *            ArrayList of Professor
	 */
	public void setPfArry(ArrayList<Professor> pfArry) {
		this.pfArry = pfArry;
	}

	/**
	 * Getter of PArry
	 * 
	 * @return PArry
	 */
	public ArrayList<Parent> getPArry() {
		return pArry;
	}

	/**
	 * Setter of PArry
	 * 
	 * @param pArry
	 *            ArrayList of Parent
	 */
	public void setpArry(ArrayList<Parent> pArry) {
		this.pArry = pArry;
	}

	/**
	 * Getter of GsaArry
	 * 
	 * @return GsaArry
	 */
	public ArrayList<GasStationAttendant> getGsaArry() {
		return gsaArry;
	}

	/**
	 * Setter of GsaArry
	 * 
	 * @param gsaArry
	 *            ArrayList of GasStationAttendant.
	 */
	public void setGsaArry(ArrayList<GasStationAttendant> gsaArry) {
		this.gsaArry = gsaArry;
	}

}
