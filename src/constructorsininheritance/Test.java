/**
 * @author David
 * This is the main class for the package constructors_in_inheritance
 */

package constructorsininheritance;

import java.util.Scanner;

public class Test {


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of contract employee: ");
		int no_CEmp=scanner.nextInt();
		ContractEmployee cEmp[]=new ContractEmployee[no_CEmp];
		float pay[]=new float[no_CEmp];
		
		for(int i=0;i<no_CEmp;i++)
		{
			cEmp[i]=new ContractEmployee();
			System.out.print("Do you want to input employee"+(i+1)+" details(Y/N): ");
			String input=scanner.next();
			if(input.equals("Y"))
			{
			System.out.println("Employee "+(i+1)+" :");
			System.out.print("Enter the name of employee: ");
			String empName=scanner.next();
			cEmp[i].setEmpName(empName);
			System.out.print("Enter the employee ID: ");
			int empId=scanner.nextInt();
			cEmp[i].setEmpId(empId);
			System.out.print("Enter the employee designation: ");
			String empDsg=scanner.next();
			cEmp[i].setEmpDsg(empDsg);
			System.out.print("Enter the no of hours: ");
			int hours=scanner.nextInt();
			cEmp[i].setHours(hours);
			System.out.print("Enter the employee's pay rate: ");
			int rate=scanner.nextInt();
			cEmp[i].setRate(rate);
			pay[i]=cEmp[i].calculatePayment(cEmp[i].getHours(),cEmp[i].getRate());
			System.out.println("----------------------------------");
			}
		

		}

		

		System.out.println("************************\n"+"CONRACT EMPLOYEES\n"+"EmpName\tEmpId\tDesignation\tHours\tRate\tPay");
		for(int i=0;i<no_CEmp;i++)
		{
			System.out.println(cEmp[i].getEmpName()+"\t"+cEmp[i].getEmpId()+"\t"+cEmp[i].getEmpDsg()+"\t"+cEmp[i].getHours()+"\t"+cEmp[i].getRate()+"\t"+pay[i]);
		}	
		System.out.println("-----------------------------------------");
		
		
		scanner.close();
	

	}

}
