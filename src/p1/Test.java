/**
 * Employee details using getters and setters from EmployeeDetails.java in employee package
 */

package p1;

import java.util.Scanner;

import employee.EmployeeDetails;

public class Test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int empNo=scanner.nextInt();		
		
		EmployeeDetails obj1[]=new EmployeeDetails[empNo];     //Object Array
		
		for(int i=0;i<empNo;i++)
		{
		obj1[i]=new EmployeeDetails();                         //declaring an object
		System.out.print("\n"+"Enter the employee name"+(i+1)+":");
		String empName=scanner.next();
		obj1[i].setEmpName(empName);
		System.out.print("Enter the employee ID"+(i+1)+":");
		int empID=scanner.nextInt();
		obj1[i].setEmpID(empID);
		System.out.print("Enter the employee Department"+(i+1)+":");
		String empDept=scanner.next();
		obj1[i].setEmpDept(empDept);
		System.out.print("Enter the employee Salary"+(i+1)+":");
		float empSalary=scanner.nextFloat();
		obj1[i].setEmpSalary(empSalary);
		}
		System.out.print("\n"+"Name \t EmpID \t Dept \t\tSalary");
		for(int i=0;i<empNo;i++)
		{			
			System.out.print("\n"+obj1[i].getEmpName()+"\t");
			System.out.print(obj1[i].getEmpID()+"\t");
			System.out.print(obj1[i].getEmpDept()+"\t");
			System.out.println(obj1[i].getEmpSalary());
		}
		
		scanner.close();
	
	}
}


