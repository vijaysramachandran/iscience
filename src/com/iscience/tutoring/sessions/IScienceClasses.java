package com.iscience.tutoring.sessions;

import java.util.Scanner;

import com.iscience.tutoring.model.Student;
import com.iscience.tutoring.model.Tutor;
import com.iscience.tutoring.model.TutoringSession;

public class IScienceClasses {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What do you want to do?\n1. Create tutor\n2. Create Session\n3. Create Student\n4. Quit");
		int choice = in.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("What is the name of the tutor?");
			in.nextLine();
			String name = in.nextLine();
			Tutor tutor1 = new Tutor(name); //Creates new tutor
			
			System.out.println("What is the phone number of the tutor?");
			String phoneNumber = in.nextLine();
			
			tutor1.setPhoneNumber(phoneNumber); //creating phone number for tutor
			System.out.println();
			System.out.println(tutor1.toString());
			break;
		
		case 2:
			System.out.println("What is the subject of the session?");
			in.nextLine();
			String subject = in.nextLine();
			
			System.out.println("What day is the tutoring session?");
			String day = in.nextLine();
			
			System.out.println("At what time is the tutoring session?");
			String time = in.nextLine();
			
			TutoringSession tutoringSession1 = new TutoringSession(subject, day, time); //with given information, creating tutoring session
			
			System.out.println("How many minutes will the tutoring session be?");
			int minutes = in.nextInt();
			tutoringSession1.setSessionLength(minutes);
			System.out.println(tutoringSession1.toString());
			break;
		
		case 3:
			System.out.println("What is the name of the student?");
			in.nextLine();
			String studentName = in.nextLine();
			Student student1 = new Student(studentName); //creating student
			
			System.out.println("What is the phone number of the student?");
			String studentPhoneNumber = in.nextLine();
			student1.setStudentPhoneNumber(studentPhoneNumber); //setting phone number for student
			
			System.out.println("What grade is the student in?");
			int grade = in.nextInt();
			student1.setGrade(grade); //setting grade for student
			
			System.out.println("What is the student's parent's name?");
			in.nextLine();
			String parentName = in.nextLine();
			student1.setParentName(parentName); //setting parent name
			
			System.out.println("What is the parent's phone number?");
			String parentPhoneNumber = in.nextLine();
			student1.setParentPhoneNumber(parentPhoneNumber); //setting parent phone number
			
			System.out.println("What school does the student go to?");
			String school = in.nextLine();
			student1.setSchoolName(school); //setting school
			
			System.out.println(student1.toString());
			break;
		
		case 4:
			break; //quitting
			
		default:
			System.out.println("Invalid answer. Please enter 1, 2, 3, or 4.");
			System.exit(choice); //invalid choice
		}
		
		
	in.close();		
	}
}
