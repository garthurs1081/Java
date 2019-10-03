package grade_Ranges_Numbers_Arthurs;

//**Student: Gary Arthurs and Shanelle Ostroski**
//**Pair Programming Exercise 2**
//**Course 2019Q3-ITSE-2017-39270**
//**Eclipse - Neon IDE**
//**Working with functions, if statements, researching and team mates to solve programmatic Problem with Java**

import java.util.Scanner;

public class Grade_Ranges_Numbers_Arthurs {
	public static void main(String args[]) {
		
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_BLUE = "\u001B[34m";
		final String ANSI_PURPLE = "\u001B[35m";
		final String ANSI_CYAN = "\u001B[36m";
		final String ANSI_YELLOW = "\u001B[33m";
		char quit;
		
		double gradeNum = (0.0);
		Scanner sc = new Scanner(System.in);
		
/*		   while(true)
		{
		    
		   try
		   {	   
			   gradeNum = Double.parseDouble(sc.next());	   
		   break;
		   }	   
		   catch (NumberFormatException ignore)
		   {		   
			   System.out.println("Inivalid Input");
		   }
		}*/
		

		do {
			System.out.println("\n**Please enter numeric grade value between 0 to 100: ");
			gradeNum = sc.nextDouble();
			
			System.out.println("\n-----------------------------------------------------------");

			
			if (gradeNum == 100 || gradeNum >=89.9) { 


			
				System.out.println("\nYou have entered "+ gradeNum + " and your Grade is an A! ");
				System.out.println("\nPlease enter numeric grade value between 0 to 100: ");
		
				System.out.println("\n-----------------------------------------------------------");
			
			
			//------------------------------------------------------------------------------------	
				
			}else if (gradeNum == 89 || gradeNum > 80) {
				System.out.println("\nYou have entered "+ gradeNum + " and your Grade is an B! ");

				
				System.out.println("\n-----------------------------------------------------------");
			//-------------------------------------------------------------------------------------	
				
			}else if (gradeNum == 79 || gradeNum > 70) {
				System.out.println("\nYou have entered " + gradeNum + " and your Grade is an C! ");
				
	
				System.out.println("\n-----------------------------------------------------------");
			//----------------------------------------------------------------------------------------
			}else if(gradeNum == 69  || gradeNum > 60) {
				System.out.println("\nYou have entered " + gradeNum + " and your Grade is an F! ");
				

				System.out.println("\n-----------------------------------------------------------");
			//------------------------------------------------------------------------------------------------		
			}else if (gradeNum <= 59 ) {
				System.out.println("\nGrade F - Better luck next time!");
				System.out.println("\n-----------------------------------------------------------");
			}
			
						
			System.out.println("\nWould you like to exit? y for yes, enter any other key to continue. ");
			quit = sc.next().charAt(0);;
		
		}while(quit != 'y' && quit != 'Y');
		System.out.println("\nYou have exited the system. ");
		

	sc.close();
	
	}
}
