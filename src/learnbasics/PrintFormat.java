/**
 * Print Format
 */
//Assignment

package learnbasics;
import java.util.Scanner;

public class PrintFormat {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines: ");
		Scanner scanner=new Scanner(System.in);
		int lines=scanner.nextInt();
		for(int i=0;i<lines;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print("*  ");
		    }
			System.out.print("\n");
		}
		for(int i=lines-1;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("*  ");
			}
			System.out.print("\n");
		}
		scanner.close();

	}

}
