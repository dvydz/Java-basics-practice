/**
 * Largest Number Using Methods(non static)
 */

package learnbasicsmethods;       

import java.util.Scanner;

public class LargestNumber {
	
	int largestNumb(int x, int y, int z)
	{
		if(x>y && x>z)
			return x;
		else if(y>x && y>z)
			return y;
		else if(z>x && z>x)
			return z;
		else return 0;
	}
	public static void main(String[] args) {
		System.out.println("Enter three numbers: ");
		Scanner scanner=new Scanner(System.in);
		int numb1=scanner.nextInt();
		int numb2=scanner.nextInt();
		int numb3=scanner.nextInt();
		
		LargestNumber Obj1=new LargestNumber();
		int largest=Obj1.largestNumb(numb1,numb2,numb3);
		
		if(largest==0)
			System.out.println("Same numbers !");
		else 
			System.out.println(largest+" is Larger !");
	
		scanner.close();

	}

}
