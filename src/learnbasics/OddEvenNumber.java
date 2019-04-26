/**
 * OddEven Number
 */
//Assignment

package learnbasics;
import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		Scanner scanner=new Scanner(System.in);
		int numb=scanner.nextInt();
		if(numb%2==0)
			System.out.println("Even number !");
		else if(numb%2==1)
			System.out.println("Odd number !");
			
		scanner.close();

	}
	

} 
