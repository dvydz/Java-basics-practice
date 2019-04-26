/**
 * Sum of Matrics 
 */

package learnbasics;

import java.util.Scanner;

public class SumOfMatrics {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the row and column size for matrices : ");
		int rowSize1=scanner.nextInt();
		int columnSize1=scanner.nextInt();
		long matrics1[][]=new long[rowSize1][columnSize1];
		long matrics2[][]=new long[rowSize1][columnSize1];
		long matrics3[][]=new long[rowSize1][columnSize1];
		
		System.out.print("Enter Matrics1 elements :");
		for(int i=0;i<matrics1.length;i++)
		{
			for(int j=0;j<matrics1[i].length;j++)
			{
				matrics1[i][j]=scanner.nextLong();
			}
		}
		System.out.print("Enter Matrics2 elements :");
		for(int i=0;i<matrics2.length;i++)
		{
			for(int j=0;j<matrics2[i].length;j++)
			{
				matrics2[i][j]=scanner.nextLong();
			}
		}
		
		System.out.println("\nMatrix 1:");
		for(int i=0;i<matrics1.length;i++)
		{
			for(int j=0;j<matrics1[i].length;j++)
			{
				System.out.print(matrics1[i][j]+"   ");
			}
			System.out.print("\n");
		}
		System.out.println("\nMatrix 2:");
		for(int i=0;i<matrics2.length;i++)
		{
			for(int j=0;j<matrics2[i].length;j++)
			{
				System.out.print(matrics2[i][j]+"   ");
			}
			System.out.print("\n");
		}

		System.out.println("\nSum of Matrices:");
		for(int i=0;i<matrics2.length;i++)
		{
			for(int j=0;j<matrics2[i].length;j++)
			{
				matrics3[i][j]=matrics1[i][j]+matrics2[i][j];
				System.out.print(matrics3[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		
		scanner.close();

	}

}
