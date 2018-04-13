package ca.ciccc.java.main;


import java.util.Collections;
import ca.ciccc.java.model.Employees;

public class Driver {
	
	public static void main(String[] args) {
		
		Employees emps = new Employees();
		
		System.out.println("##### Before ######");
		emps.display(emps.getHpArry(), emps.getPfArry(), emps.getPArry(), emps.getGsaArry());

		Collections.sort(emps.getHpArry());
		Collections.sort(emps.getPfArry());
		Collections.sort(emps.getPArry());
		Collections.sort(emps.getGsaArry());
				
		System.out.println();
		System.out.println("##### After ######");
		emps.display(emps.getHpArry(), emps.getPfArry(), emps.getPArry(), emps.getGsaArry());
	}

}
