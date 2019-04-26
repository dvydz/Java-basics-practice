/**
 * 1D array display
 */

package learnbasics;
import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		System.out.print("Enter the size of the array: ");
		Scanner scanner=new Scanner(System.in);
		int arraySize=scanner.nextInt();
		long PhoneNumber[]=new long[arraySize];
		for(int i=0;i<PhoneNumber.length;i++)
		{
		System.out.print("Enter phone number"+(i+1)+":");
		PhoneNumber[i]=scanner.nextLong();
		}
		for(int i=0;i<PhoneNumber.length;i++)
		{
			System.out.println("\n Phone number "+(i+1)+" is "+PhoneNumber[i]);
		}
		
		scanner.close();

	}
 
}
