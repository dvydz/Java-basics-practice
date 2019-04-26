//Object array inheritance for multiple executions.

package inheritance;

import java.util.Scanner;

public class StudentObjectArrayMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of Students: ");
		int stuNo=scanner.nextInt();
		Student s1[]=new Student[stuNo];
		for(int i=0;i<stuNo;i++)
		{
			System.out.println("Student "+(i+1) +":");
			s1[i]=new Student();
			
			System.out.print("Enter the Student ID: ");
			int sID=scanner.nextInt();
			s1[i].setSID(sID);
			
			System.out.print("Enter the first name of Student: ");
			String sName=scanner.next();
			s1[i].setSName(sName);
			
			System.out.print("Enter the Last name of Student: ");
			String lastName=scanner.next();
			s1[i].setLastName(lastName);
			
			System.out.print("Enter the Address: ");
			String address=scanner.next();
			s1[i].setAddress(address);
			
			System.out.print("Enter the Contact number: ");
			long contact=scanner.nextLong();
			s1[i].setContactNo(contact);
		}
		
		System.out.println("Student Details :");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("SId \t SName \t\t SLastName \t Address \t ContactNo	");

		for(int i=0;i<stuNo;i++)
		{
			System.out.println(s1[i].getSID()+"\t"+s1[i].getSName()+"\t\t"+s1[i].getLastName()+"\t"+s1[i].getAddress()+"\t\t"+s1[i].getContactNo());
		}
		scanner.close();
	}

}
