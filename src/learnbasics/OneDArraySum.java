/**
 * 1D Array Sum
 */

package learnbasics;
import java.util.Scanner;

public class OneDArraySum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of array 1: ");
		int size1=scanner.nextInt();
		System.out.print("Enter the size of array 2(Same as array1): ");
		int size2=scanner.nextInt();
		int mat1[]=new int[size1];
		int mat2[]=new int[size2];
		int mat3[]=new int[size1];
		System.out.println("Enter the array 1 elements:");
		for(int i=0;i<size1;i++)
		{
			System.out.print("Enter index["+i+"] : ");
			mat1[i]=scanner.nextInt();			
		}
		System.out.println("Enter the array 2 elements:");
		for(int i=0;i<size1;i++)
		{
			System.out.print("Enter index["+i+"] : ");
			mat2[i]=scanner.nextInt();			
		}
		System.out.print("Array1 : ");
		for(int i=0;i<size1;i++)
			System.out.print(mat1[i]+" ");
		System.out.print("\nArray2 : ");
		for(int i=0;i<size1;i++)
			System.out.print(mat2[i]+" ");
			
		
		System.out.print("\nSum :");
		for(int i=0;i<size1;i++)
		{
			mat3[i]=mat1[i]+mat2[i];
			System.out.print(mat3[i]+" ");						
		}
		scanner.close();
	}

}
