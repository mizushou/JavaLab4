package ca.ciccc.java.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ca.ciccc.java.model.Employees;

public class EmployeeTest1 {

	private Employees emps;

	@Before
	public void setUp() throws Exception {
		emps = new Employees();
	}

	@Test
	public void testHpEquals() {
		// hp vs not hp
		assertEquals(false, emps.getHpArry().get(1).equals(emps.getPArry().get(1)));
		// hp vs hp - not equal
		assertEquals(false, emps.getHpArry().get(1).equals(emps.getHpArry().get(2)));
		// hp vs hp- equal
		assertEquals(true, emps.getHpArry().get(1).equals(emps.getHpArry().get(4)));
	}

	@Test
	public void testPfEquals() {
		// pf vs not pf
		assertEquals(false, emps.getPfArry().get(1).equals(emps.getHpArry().get(1)));
		// pf vs pf - not equal
		assertEquals(false, emps.getPfArry().get(1).equals(emps.getPfArry().get(0)));
		// pf vs pf - equal
		assertEquals(true, emps.getPfArry().get(1).equals(emps.getPfArry().get(3)));
	}

	@Test
	public void testPEquals() {
		// p vs not p
		assertEquals(false, emps.getPArry().get(1).equals(emps.getHpArry().get(1)));
		// p vs p - not equal
		assertEquals(false, emps.getPArry().get(1).equals(emps.getPArry().get(0)));
		// p vs p - equal
		assertEquals(true, emps.getPArry().get(1).equals(emps.getPArry().get(3)));
	}

	@Test
	public void testGsaEquals() {
		// gsa vs not gsa
		assertEquals(false, emps.getGsaArry().get(1).equals(emps.getHpArry().get(1)));
		// gsa vs gsa - not equal
		assertEquals(false, emps.getGsaArry().get(1).equals(emps.getGsaArry().get(3)));
		// gsa vs gsa - equal
		assertEquals(true, emps.getGsaArry().get(1).equals(emps.getGsaArry().get(2)));
	}

}
