/**
 * Prime Number
 */
//Assignment

package learnbasics;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numb=scanner.nextInt();
		boolean isPrime=true;
		for(int i=2;i<numb;i++)
		{
			int temp=numb%i;			
			if(temp==0)
			{
			isPrime=false;
			break;
			}
			
		}
		
	if(isPrime)
		System.out.println("Prime !");
	else
		System.out.println("Not Prime !");
	scanner.close();
	}
}
