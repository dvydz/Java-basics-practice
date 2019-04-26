package stringfunctions;

import java.util.Scanner;

public class GetBytesDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter any String: ");
		String string=scanner.next();							//string.getBytes() converts the string and stores it into a given array
		System.out.println(string);								//Returns int(ASCII code)
		byte array[]=string.getBytes();							//for loop required to display all the character's ASCII code
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		scanner.close();

	}

}
