package stringfunctions;

import java.util.Scanner;

public class EndsWithDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();							//string.endsWith("_")checks if a string ends with a given character
		System.out.println(string);								//Returns Boolean
		System.out.println(string.endsWith("r"));				
		scanner.close();

	}

}
