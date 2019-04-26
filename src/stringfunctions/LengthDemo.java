package stringfunctions;

import java.util.Scanner;

public class LengthDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();						//string.length provides the length of the string
		System.out.println(string);							//Returns Int
		System.out.println(string.length());
		scanner.close();

	}

}
