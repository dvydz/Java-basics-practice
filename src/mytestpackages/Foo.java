package mytestpackages;

import java.util.Scanner;

public class Foo {

	public static void main(String[] args) {
		String input;
		Scanner scanner=new Scanner(System.in);
		do
		{
			
		GFG obj=new GFG();
		System.out.print("Enter the Doctor's Name: ");
		String dName=scanner.next();
		obj.setDoctorName(dName);
		System.out.print("Enter the Doctor's Specialization: ");
		String dDsg=scanner.next();
		obj.setDoctorDsg(dDsg);
		System.out.print("Enter the Doctor's Salary: ");
		int salary=scanner.nextInt();
		obj.setSalary(salary);
		System.out.print("Do you want to enter another doctor's info(Y/N): ");
		input=scanner.next();
		if(input.equals("N"))
		{
			for(int i=0;i<2;i++)
			{
				System.out.println(obj.getDoctorName());
				System.out.println(obj.getDoctorDsg());
				System.out.println(obj.getSalary());
			}
			
			
		}
		}while(input.equalsIgnoreCase("Y"));
		

	}

}
