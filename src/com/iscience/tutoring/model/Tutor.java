package com.iscience.tutoring.model;

public class Tutor {

	private String tutorName;
	private String phoneNumber;
	
	public Tutor() {}
	
	public Tutor(String tutor) {
		this.tutorName = tutor;
	}
	
	public void setTutorName(String name) {
		this.tutorName = name;
	}
	
	public String getTutorName() {
		return tutorName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Tutor [tutor=" + tutorName + ", phoneNumber=" + phoneNumber + "]";
	}
}
