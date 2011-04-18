package edu.vt.cs;

public class Course {
	
	private int mStudentID;
	private int mIndex;
	private String mDept;
	private int mCourseNum;
	private String mTerm;
	private int mYear;
	private double mCreditHours;
	private String mGrade;
	
	public Course() {
		
	}
	
	public boolean inputCourseData(String inCourse) {
		try {
			String[] data = inCourse.split("\\t");
			if(data.length != 7) {
				System.out.println("Invalid Data: " + inCourse);
				return false;
			}
			mStudentID = Integer.parseInt(data[0]);
			mIndex = Integer.parseInt(data[1]);
			mDept = data[2];
			mCourseNum = Integer.parseInt(data[3]);
			mTerm = data[4];
			mYear = Integer.parseInt(data[5]);
			mCreditHours = Double.parseDouble(data[6]);
			mGrade = data[7];
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// Setters and Getters
	
	public int getStudentID() {
		return mStudentID;
	}

	public void setStudentID(int studentID) {
		mStudentID = studentID;
	}

	public int getIndex() {
		return mIndex;
	}

	public void setIndex(int index) {
		mIndex = index;
	}

	public String getDept() {
		return mDept;
	}

	public void setDept(String dept) {
		mDept = dept;
	}

	public int getCourseNum() {
		return mCourseNum;
	}

	public void setCourseNum(int courseNum) {
		mCourseNum = courseNum;
	}

	public String getTerm() {
		return mTerm;
	}

	public void setTerm(String term) {
		mTerm = term;
	}

	public int getYear() {
		return mYear;
	}

	public void setYear(int year) {
		mYear = year;
	}

	public double getCreditHours() {
		return mCreditHours;
	}

	public void setCreditHours(double creditHours) {
		mCreditHours = creditHours;
	}

	public String getGrade() {
		return mGrade;
	}

	public void setGrade(String grade) {
		mGrade = grade;
	}
	
}
