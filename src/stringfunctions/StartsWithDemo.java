package stringfunctions;

import java.util.Scanner;

public class StartsWithDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();							//string.startsWith("_")checks if a string starts with a given character
		System.out.println(string);								//Returns Boolean
		System.out.println(string.startsWith("D"));				
		scanner.close();
	}

}
