/**
 * Lucky Number
 */
//Assignment

package learnbasics;
import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner=new Scanner(System.in);
		int temp=1,total;
		int numb=scanner.nextInt();
		
		do
		{
			total=0;
			while(numb>0)
			{
				temp=numb%10;
				total+=temp;
				numb/=10;
			}
			numb=total;
		}
		while(numb>9);
		
		System.out.println("Lucky number is :"+total);
		scanner.close();
		
		/*while(temp>0)   //Similar code 
		{
		temp=numb%10;
		total+=temp;
		numb=numb/10;
		}
		if(total>=10)
		{
			int total2=total;
			total=0;
			temp=1;
			while(temp>0)
			{
			temp=total2%10;
			total+=temp;
			total2=total2/10;
			
			}
		}
			
		System.out.println("Lucky number is : "+ total);
		scanner.close();
		*/
	}

}
