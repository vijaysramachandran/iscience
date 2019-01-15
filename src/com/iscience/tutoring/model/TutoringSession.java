package com.iscience.tutoring.model;

import java.util.ArrayList;

public class TutoringSession {

	private Tutor tutor;
	private ArrayList<Student> students = new ArrayList<>();
	private String subject;
	private String day;
	private String time;
	private int sessionLength;	
	
	public TutoringSession() {}
	
	public TutoringSession(String subject, String day, String time) {
		this.subject = subject; 
		this.day = day;
		this.time = time;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDay() {
		return day;
	}
	
	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public int getSessionLength() {
		return sessionLength;
	}

	public void setSessionLength(int sessionLength) {
		this.sessionLength = sessionLength;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	@Override
	public String toString() {
		return "TutoringSession [tutor=" + tutor + ", students=" + students + ", subject=" + subject + ", day=" + day
				+ ", time=" + time + ", session length=" + sessionLength + " minutes]";
	}	
}
