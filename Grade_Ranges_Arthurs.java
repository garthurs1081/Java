package grade_Ranges_Arthurs;

//Student: Gary Arthurs
//Course 2019Q3-ITSE-2017-39270
//Eclipse - Neon IDE
//The program is called Grade Ranges.

import java.util.Scanner;

public class Grade_Ranges_Arthurs {
		
	public static void main(String[] args) {
		
		//Input Process:
		
		char letterGrade;
		Scanner sc = new Scanner (System.in);

		do {
		
		System.out.print("\nPlease enter your letter grade: A, B, C, D, or F (Enter 'n' or 'N' to exit) ");				
		letterGrade = sc.next().charAt(0); //To handle the character
			
		//Data Validation: (Don't work for me :) )
					//while (!sc.hasNext("[a-zA-Z]")) {
					//	sc.next();
					//while(true){
					// break;

		//Process the Grades:
		
		System.out.println("------------------------------------------------------------");
		
		if (letterGrade == 'A' || letterGrade =='a') {
			System.out.println("\nA numerical range of 90 % points were earned or better.");
				
		}else if (letterGrade == 'B' || letterGrade =='b') {
			System.out.println("\nA numerical range of 80 % points were earned or better.");
						
		}else if (letterGrade == 'C' || letterGrade == 'c') {
			System.out.println("\nA numerical range of 70 % points were earned or better.");
			
		}else if (letterGrade == 'D' || letterGrade == 'd') {
			System.out.println("\nA numerical range of 60 % points were earned or better.");
			
		}else if (letterGrade == 'F' || letterGrade =='f') {
			System.out.println("\nA numerical range of 50 % points were earned or better and YOU FLUNKED the course!. Better luck next time");
				
        }else {
            System.out.println("\nYou have entered an invalid value please enter A, B, C, D or F\n");
            
        }

		//Output the Results:
		System.out.println("------------------------------------------------------------");		
		
		}while(letterGrade != 'n' && letterGrade != 'N'); //DeMorgans Law
		System.out.println("You have exited the System");
							
		sc.close();	
		}		
	}