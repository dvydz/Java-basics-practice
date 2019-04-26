/**
 * Display matrics
 */
//Assignment

package learnbasics; 
import java.util.Scanner;

public class DisplayMatrics {

	public static void main(String[] args) {
		System.out.print("Enter the row size: ");
		Scanner scanner=new Scanner(System.in);
		int rowSize=scanner.nextInt();
		System.out.print("Enter the column size:");
		int columnSize=scanner.nextInt();
		long matrics[][]=new long[rowSize][columnSize];
		for(int i=0;i<matrics.length;i++)
		{
			for(int j=0;j<matrics[i].length;j++)
			{
				System.out.print("Enter ["+i+"]["+j+"] : ");
				matrics[i][j]=scanner.nextLong();
			}
		}
	
		for(int i=0;i<matrics.length;i++)
		{
			System.out.print("\n\t");
			for(int j=0;j<matrics[i].length;j++)
			{
				System.out.print(matrics[i][j]+"   ");
			}
			System.out.print("\n");
		}
		scanner.close();
		
		
	}

}
