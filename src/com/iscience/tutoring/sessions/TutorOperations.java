package com.iscience.tutoring.sessions;

import java.util.Scanner;
import com.iscience.tutoring.model.Tutor;

public class TutorOperations {

	public void displayChoices() {
		Scanner in = new Scanner(System.in);
		boolean trueOrFalse;
	
		do {
			System.out.println("What would you like to do?\n1. Create Tutor\n2. Update Tutor Phone Number\n3. Delete Tutor\n4. Go Back");
			int choice = in.nextInt();
			
			switch(choice) {
			
				case 1: 
					System.out.println("What is the name of the tutor?");
					in.nextLine();
					String name = in.nextLine();
					
					Tutor t1 = new Tutor(name);
					
					System.out.println("What is the phone number of the tutor?");
					String phoneNumber = in.nextLine();
					t1.setPhoneNumber(phoneNumber);
					trueOrFalse = true;
					break;
				
				case 2:	
					System.out.println("Whose phone number do you want to change? Tutor name please.");
					in.nextLine();
					String tutor = in.nextLine();
					trueOrFalse = true;
					break;
					
				case 3:
					System.out.println("Who got fired?");
					in.nextLine();
					String firedTutor = in.nextLine();
					trueOrFalse = true;
					break; 
				
				case 4:
					trueOrFalse = false;
					return;
				
				default:
					trueOrFalse = true;
					System.out.println("invalid answer");
			}

		}while(trueOrFalse);
		in.close();
	}
	
}
