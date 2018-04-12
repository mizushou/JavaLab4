package ca.ciccc.java.model;

import java.util.ArrayList;

public class Employees {
	
	public Employees() {
		ArrayList<Employee> empArry = new ArrayList<Employee>();

		// HockyePlayer
		empArry.add(new HockeyPlayer("Wayne Gretzky", 894));
		empArry.add(new HockeyPlayer("Who Ever", 0));
		empArry.add(new HockeyPlayer("Brent Gretzky", 1));
		empArry.add(new HockeyPlayer("Pavel Bure", 437));
		empArry.add(new HockeyPlayer("Jason Bourne", 0));
		
		// Professor
		empArry.add(new Professor("Albert Einstein", "Physics"));
		empArry.add(new Professor("Alan Turing", "Computer Systems"));
		empArry.add(new Professor("Richard Feynman", "Physics"));
		empArry.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		empArry.add(new Professor("Kurt Godel", "Logic"));
		
		// Parent
		empArry.add(new Parent("Tiger Woods", 1));
		empArry.add(new Parent("Super Mom", 168));
		empArry.add(new Parent("Lazy Larry", 20));
		empArry.add(new Parent("Ex Hausted", 168));
		empArry.add(new Parent("Super Dad", 167));

		// GasStationAttend
		empArry.add(new GasStationAttendant("", ));
		empArry.add(new GasStationAttendant("", ));
		empArry.add(new GasStationAttendant("", ));
		empArry.add(new GasStationAttendant("", ));
		empArry.add(new GasStationAttendant("", ));
		
	}
	

	

}
