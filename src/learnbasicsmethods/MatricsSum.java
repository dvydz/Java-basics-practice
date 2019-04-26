/**
 * Sum of 1D array Using methods(non static)
 */

package learnbasicsmethods; 

import java.util.Scanner;

public class MatricsSum {
	
	void arraySum(int Arr1[],int Arr2[])
	{
		int Arr3[]=new int[Arr1.length];
		System.out.print("\nSum :");
		for(int a=0;a<Arr1.length;a++)
		{
			Arr3[a]=Arr1[a]+Arr2[a];
			System.out.print(Arr3[a]+" ");						
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the size of array 1: ");
		int size1=scanner.nextInt();
		System.out.print("Enter the size of array 2(Same as array1): ");
		int size2=scanner.nextInt();
		int mat1[]=new int[size1];
		int mat2[]=new int[size2];
		System.out.println("Enter the array 1 elements:");
		for(int i=0;i<size1;i++)
		{
			System.out.print("Enter index["+(i+1)+"] : ");
			mat1[i]=scanner.nextInt();			
		}
		System.out.println("Enter the array 2 elements:");
		for(int i=0;i<size1;i++)
		{
			System.out.print("Enter index["+(i+1)+"] : ");
			mat2[i]=scanner.nextInt();			
		}
		System.out.print("Array1 : ");
		for(int i=0;i<size1;i++)
			System.out.print(mat1[i]+" ");
		System.out.print("\nArray2 : ");
		for(int i=0;i<size1;i++)
			System.out.print(mat2[i]+" ");
		MatricsSum obj1=new MatricsSum();
		obj1.arraySum(mat1,mat2);
			
		scanner.close();

	}

}
