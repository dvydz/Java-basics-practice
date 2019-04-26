package stringfunctions;

import java.util.Scanner;

public class CharAtDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();
		System.out.println(string);							//string.charAt(_) provides the character at index 5 of the string
		System.out.println(string.charAt(5));				//Return int
		scanner.close();

	}

}
