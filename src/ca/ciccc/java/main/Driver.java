package ca.ciccc.java.main;

import java.util.Collection;
import java.util.Collections;

import ca.ciccc.java.model.DressCode;
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

//		System.out.println(DressCode.ANYTHING);
//		System.out.println(DressCode.ANYTHING.getDetail());
//		System.out.println(DressCode.ANYTHING.ordinal());
//		
//		// FANCY is only one
//		DressCode dressCode = DressCode.FANCY;
//		DressCode dressCode2 = DressCode.FANCY;
//		
//		if(dressCode == dressCode2) 
//			System.out.println("Equal!");
//		else
//			System.out.println("Not equal!");
//		
//		switch (dressCode) {
//		case JERSEY:
//			System.out.println("JERSEY");
//			break;
//		case FANCY:
//			System.out.println("FANCY");
//			break;
//		case ANYTHING:
//			System.out.println("ANYTHING");
//			break;
//		case UNIFORM:
//			System.out.println("UNIFORM");
//			break;
//		}
	}

}
