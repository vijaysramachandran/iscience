package com.iscience.tutoring.model;

import java.util.ArrayList;

public class TutoringSession {

	private Tutor tutor;
	private ArrayList<Student> students = new ArrayList<>();
	private String subject;
	private String day;
	private String time;
	private int minutes;	
	
	public TutoringSession(String subject, String day, String time) {
		this.subject = subject; 
		this.day = day;
		this.time = time;
	}
	

	@Override
	public String toString() {
		return "TutoringSession [tutor=" + tutor + ", students=" + students + ", subject=" + subject + ", day=" + day
				+ ", time=" + time + ", minutes=" + minutes + "]";
	}


	public String getSubject() {
		return subject;
	}
	
	public String getDay() {
		return day;
	}
	
	public String getTime() {
		return time;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
		
}
