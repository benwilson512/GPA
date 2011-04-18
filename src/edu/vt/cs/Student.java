package edu.vt.cs;

import java.util.HashMap;

public class Student {

	private int mID;
	private String mName;
	private String mAddress;
	private String mState;
	private int mZip;
	private String mMajor;
	private String mMinor;
	private int mRank;
	private double mGPA;

	private static HashMap<Integer, Student> mStudents;

	public Student() {

	}
	
	/**
	 * 
	 * @param inStudent
	 * @return
	 */
	public boolean inputStuData(String inStudent) {
		try {
			String[] data = inStudent.split("\\t");
			mID = Integer.parseInt(data[0]);
			mName = data[1];
			mAddress = data[2];
			mState = data[3];
			mZip = Integer.parseInt(data[4]);
			mMajor = data[5];
			mMinor = data[6];
			mRank = Integer.parseInt(data[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Data:" + inStudent);
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		addStudent(this);
		return true;
	}

	public static HashMap<Integer, Student> all() {
		return mStudents;
	}

	/**
	 * 
	 * @param student
	 */
	public static void addStudent(Student student) {
		mStudents.put(student.getID(), student);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static Student findByID(int id) {
		return mStudents.get(id);
	}

	// Setters and Getters
	
	public int getID() {
		return mID;
	}

	public void setID(int iD) {
		mID = iD;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getAddress() {
		return mAddress;
	}

	public void setAddress(String address) {
		mAddress = address;
	}

	public String getState() {
		return mState;
	}

	public void setState(String state) {
		mState = state;
	}

	public int getZip() {
		return mZip;
	}

	public void setZip(int zip) {
		mZip = zip;
	}

	public String getMajor() {
		return mMajor;
	}

	public void setMajor(String major) {
		mMajor = major;
	}

	public String getMinor() {
		return mMinor;
	}

	public void setMinor(String minor) {
		mMinor = minor;
	}

	public int getRank() {
		return mRank;
	}

	public void setRank(int rank) {
		mRank = rank;
	}

	public double getGPA() {
		return mGPA;
	}

	public void setGPA(double gPA) {
		mGPA = gPA;
	}

}
