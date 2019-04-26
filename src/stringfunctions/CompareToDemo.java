package stringfunctions;

import java.util.Scanner;

public class CompareToDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();							//string.compareTo("_")compares the first letter of the given word to string(Case matters),
		System.out.println(string);								//And returns the difference
		System.out.println(string.compareTo("Milan"));			//Returns int, ASCII code	
		scanner.close();

	}

}
