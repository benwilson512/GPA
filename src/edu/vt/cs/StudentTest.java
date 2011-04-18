package edu.vt.cs;


import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class StudentTest extends TestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	public void test_student_string_parsing() {
		Student student = new Student();
		student.inputStuData("135792468	Wayne, John Duke	101 Hollywood Way	CA	40815	CS	MATH	10	3.2667	4.0000	49	15");
		assertEquals(student.getID(), 135792468);
		assertEquals(student.getName(), "Wayne, John Duke");
		assertEquals(student.getAddress(), "101 Hollywood Way");
		assertEquals(student.getState(), "CA");
		assertEquals(student.getZip(), 40815);
		assertEquals(student.getMajor(), "CS");
		assertEquals(student.getMinor(), "MATH");
		assertEquals(student.getRank(), 10);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
