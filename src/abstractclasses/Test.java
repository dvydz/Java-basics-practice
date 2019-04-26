package abstractclasses;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the type of payment you want: ");
		String paymentType=scanner.next();
		Payment obj;
		if(paymentType.equals("Cash"))
			obj=new Cash();
		else
			obj=new Credit();
		obj.payment(50);
		
		
		scanner.close();
		
	}

}
