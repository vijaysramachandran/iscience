package com.iscience.tutoring.sessions;

import java.util.Scanner;

import com.iscience.tutoring.model.TutoringSession;

public class SessionOperations {

	public void displayChoices() {
		Scanner in = new Scanner(System.in);
		boolean trueOrFalse = true;
		
		do {
			System.out.println("What would you like to do?\n1. Create Session\n2. Assign tutor to session\n3. Add student to session\n4. Remove student from session\n5. Delete session\n6. Quit");
			int choice = in.nextInt();
			
			switch(choice) {
			
				case 1:
					System.out.println("What is the subject of the session?");
					in.nextLine();
					String subject = in.nextLine();
					
					System.out.println("What is the day of the lesson (day of the week)?");
					String day = in.nextLine();
					
					System.out.println("At what time is the lesson?");
					String time = in.nextLine();
					
					TutoringSession session = new TutoringSession(subject, day, time);
					break;
					
				case 2:
					System.out.println("Which session should the tutor be assigned to?");
					in.nextLine();
					//need input
					System.out.println("Which tutor should be assigned to the session?");
					String tutor = in.nextLine();
					break;
				
				case 3:
					System.out.println("Which session should the student be assigned to?");
					in.nextLine();
					//need input
					System.out.println("Which student should be assigned to the session?");
					String student = in.nextLine();
					break;
				
				case 4:
					System.out.println("Which student has to be removed?");
					in.nextLine();
					String student1 = in.nextLine();
					//session.removeStudent("student")
					break;
				case 5:
					System.out.println("Which session has to be deleted?");
					in.nextLine();
					//need input
					break;
				case 6:
					trueOrFalse = false;
					return;
					
				default:
					System.out.println("Please enter a valid answer?");
					
			}
		}while(trueOrFalse);
	}
}
