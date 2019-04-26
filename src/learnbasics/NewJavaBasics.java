/**
 * @author David
 * This is just a basic java practice codes
 */
//Assignment

package learnbasics;
import java.util.Scanner;

public class NewJavaBasics {
	
	static       //Static block defined(can be defined anywhere. will be the 1st in the class to execute)
	{
		System.out.println("Resource is loading.....");
	}
	
	public static void main(String[] Args) {
		
	//1(CommandLineArguement).	System.out.println(Args[0]+Args[1]+Args[2]);

	//2(parseInt).	System.out.println(Integer.parseInt(Args[0])+Integer.parseInt(Args[2]));
	
		
			System.out.print("Enter your rollno:");
			Scanner scr=new Scanner(System.in);
			int rollno=scr.nextInt();
			System.out.println("Your roll number is stored as:"+ rollno);
			scr.close();

		
		
	}
	static        //Multiple static block defined. It will run after the first static block has run
	{
		System.out.println("Resource is loading Again.....");
	}
	
} 
