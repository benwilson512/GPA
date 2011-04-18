package edu.vt.cs;

import junit.framework.TestCase;


public class CourseTest extends TestCase {
	
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

}
