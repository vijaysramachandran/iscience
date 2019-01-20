package com.iscience.tutoring.sessions;

import java.util.Scanner;

import com.iscience.tutoring.model.Student;
public class StudentOperations 
{
	public void displayChoices()
	{
		Scanner out = new Scanner(System.in);
		boolean trueOrFalse = true;
		
		do
		{
			System.out.println("What would you like to do?\n1. Create Student\n2. Update Student Phone Number\n3. Update Parent Phone Number\n4.Update Student Course Grade\n5. Update Student Academic Grade\n6. Go Back");
			int choice = out.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("What is the name of the student?");
				out.nextLine();
				String name = out.nextLine();
				
				Student s1 = new Student(name);
				
				System.out.println("What is the student's phone number?");
				String phoneNumber = out.nextLine();
				s1.setStudentPhoneNumber(phoneNumber);
				
				System.out.println("What is the name of the parent?");
				String parentName = out.nextLine();
				s1.setParentName(parentName);
				
				System.out.println("What is the parent's phoneNumber?");
				String parentPhoneNumber = out.nextLine();
				s1.setParentPhoneNumber(parentPhoneNumber);
				
				System.out.println("What is the student's current Academic Grade?");
				int academicGrade = out.nextInt();
				s1.setGrade(academicGrade);
				
				System.out.println("What is the student's current letter grade in the subject that he/she needs help in?");
				String courseGrade = out.nextLine();
				out.nextLine();
				s1.setCourseGrade(courseGrade);
				break;
			case 2:
				System.out.println("which student has a new phone number?");
				out.nextLine();
				String student = out.nextLine();
				break;
			case 3:
				System.out.println("Which student's parent has a new phoneNumber?");
				out.nextLine();
				String studentAgain = out.nextLine();
				break;
			case 4:
				System.out.println("Whose letter grade has changed?");
				out.nextLine();
				String studentAgainAgain = out.nextLine();
				break;
			case 5:
				System.out.println("Who is older?");
				out.nextLine();
				String studentAgainAgainAgain = out.nextLine();
				break;
			case 6:
				trueOrFalse = false;
				return;
			default:
				System.out.println("Invalid entry, please sumbit using the number next to your choice?");
				break;
			}
		}
		while(trueOrFalse);
	}
}
