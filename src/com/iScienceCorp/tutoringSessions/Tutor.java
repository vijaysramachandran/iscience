package com.iScienceCorp.tutoringSessions;

public class Tutor {

	private String tutor;
	private String phoneNumber;
	
	public Tutor(String tutor) {
		this.tutor = tutor;
	}
	
	public String getTutorName() {
		return tutor;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Tutor [tutor=" + tutor + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
