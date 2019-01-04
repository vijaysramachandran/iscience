package com.iScienceCorp.tutoringSessions;

public class Student {

	private String student;
	private String StudentPhoneNumber;
	private String letterGrade;
	private int grade;
	private String parentName;
	private String parentPhoneNumber;
	private String schoolName;
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Student(String student) {
		this.student = student;	
	}
	
	public String getStudentName() {
		return student;
	}

	public String getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + ", StudentPhoneNumber=" + StudentPhoneNumber + ", letterGrade="
				+ letterGrade + ", grade=" + grade + ", parentName=" + parentName + ", parentPhoneNumber="
				+ parentPhoneNumber + ", schoolName=" + schoolName + "]";
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getStudentPhoneNumber() {
		return StudentPhoneNumber;
	}

	public void setStudentPhoneNumber(String studentPhoneNumber) {
		StudentPhoneNumber = studentPhoneNumber;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentPhoneNumber() {
		return parentPhoneNumber;
	}

	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
	}
	
	
	
}
