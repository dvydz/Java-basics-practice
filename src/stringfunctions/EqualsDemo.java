package stringfunctions;

import java.util.Scanner;

public class EqualsDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();							//string.equals(variable or "_") compares if string matches the given variable or word
		System.out.println(string);								//Returns Boolean ; Considers Upper/Lower case
		System.out.println(string.equals("David"));		
		
		System.out.println(string.equalsIgnoreCase("David"));	//Ignores the case type, and only compares the actual word
		
		scanner.close();

	}

}
