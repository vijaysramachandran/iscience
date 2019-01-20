package com.iscience.tutoring.sessions;

import java.util.Scanner;

import com.iscience.tutoring.model.Student;
import com.iscience.tutoring.model.TutoringSession;

public class IScienceClasses {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		boolean trueOrFalse = true;
		do
		{
			System.out.println("What do you want to do?\n1. Change tutor information\n2. Change Session Information\n3. Change student information\n4. Quit");
			int choice = in.nextInt();

			switch (choice) {
			case 1:
				TutorOperations ops = new TutorOperations();
				ops.displayChoices();
				break;

			case 2:
				SessionOperations ops1 = new SessionOperations();
				ops1.displayChoices();
				break;

			case 3:
				System.out.println("What is the name of the student?");
				in.nextLine();
				String studentName = in.nextLine();
				Student student1 = new Student(studentName); // creating student

				System.out.println("What is the phone number of the student?");
				String studentPhoneNumber = in.nextLine();
				student1.setStudentPhoneNumber(studentPhoneNumber); // setting phone number for student

				System.out.println("What grade is the student in?");
				int grade = in.nextInt();
				student1.setGrade(grade); // setting grade for student

				System.out.println("What is the student's parent's name?");
				in.nextLine();
				String parentName = in.nextLine();
				student1.setParentName(parentName); // setting parent name

				System.out.println("What is the parent's phone number?");
				String parentPhoneNumber = in.nextLine();
				student1.setParentPhoneNumber(parentPhoneNumber); // setting parent phone number

				System.out.println("What school does the student go to?");
				String school = in.nextLine();
				student1.setSchoolName(school); // setting school

				System.out.println(student1.toString());
				break;

			case 4:
				trueOrFalse = false;
				break; // quitting

			default:
				System.out.println("Invalid answer. Please enter 1, 2, 3, or 4.");
				break;
			}
		}while(trueOrFalse);

		in.close();
	}
}
