/**
 * Largest Number Using Methods(static)
 */

package learnbasicsmethods;   

import java.util.Scanner;

public class OddEvenNumber {
	
	static void checkOddEven(int num)
	{
		String result = num%2==0 ? "Even" : "Odd";
		System.out.println(result + " number");
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner scanner=new Scanner(System.in);
		int numb=scanner.nextInt();
		OddEvenNumber.checkOddEven(numb);   //Static functions are called with class names
		numb=scanner.nextInt();
		OddEvenNumber.checkOddEven(numb);
		numb=scanner.nextInt();
		OddEvenNumber.checkOddEven(numb);
	
		
		scanner.close();
	}

}
