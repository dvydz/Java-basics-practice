/**
 * Swich usage
 */
//Assignment

package learnbasics;
import java.util.Scanner;

public class SwitchWeekday {

	public static void main(String[] args) {
		System.out.println("Enter a weekday number: ");
		Scanner scanner=new Scanner(System.in);
		int numb=scanner.nextInt();
		switch(numb)
		{
		case 1: System.out.println("Sunday");
				
		case 2: System.out.println("Monday");
			
		case 3: System.out.println("Tuesday");
			
		case 4: System.out.println("Wednesday");
				break;
		case 5: System.out.println("Thursday");
				break;
		case 6: System.out.println("Friday");
				break;
		case 7: System.out.println("Saturday");
				break;
		default: System.out.println("Invalid Entry");
		}
		
		scanner.close();
	}

}
