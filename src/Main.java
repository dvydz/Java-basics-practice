import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Enter a car you want to drive(sports/family): ");
		Scanner scanner=new Scanner(System.in);
		String car_name=scanner.next();
		Car obj7;
		if(car_name.equals("sports"))
		{
			obj7= new SportsCar();
			//obj7.main();
			obj7.print();
		}
		else if(car_name.equals("family"))
		{
			obj7= new FamilyCar();
			obj7.print();
		}
		
		scanner.close();
	}
}
