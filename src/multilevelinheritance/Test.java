/**
 * @author David
 * This is the main class for the package multilevel_inheritance
 */
// The same thing is done in package MyCoreJavaClass with more accuracy with the help of Tutor
package multilevelinheritance;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentResult sResult=new StudentResult();
		System.out.print("Enter the Student name, ID, Department: ");
		String sName=scanner.next();
		int sID=scanner.nextInt();
		String sDept=scanner.next();
		sResult.setSName(sName);
		sResult.setSID(sID);
		sResult.setSDept(sDept);	
		System.out.print("Enter the marks in Maths,Biology,Computer,History,Chemistry :");
		int s1Mark=scanner.nextInt();
		sResult.setS1Marks(s1Mark);
		int s2Mark=scanner.nextInt();
		sResult.setS2Marks(s2Mark);
		int s3Mark=scanner.nextInt();
		sResult.setS3Marks(s3Mark);
		int s4Mark=scanner.nextInt();
		sResult.setS4Marks(s4Mark);
		int s5Mark=scanner.nextInt();
		sResult.setS5Marks(s5Mark);
		
		System.out.println("\nStuName\tStu_ID\tStu_Dept\tMaths\tBiology\tComputer\tHistory\tChemistry\tTotal\tAverage\tGrade");
		System.out.println(sResult.getSName()+"\t"+sResult.getSID()+"\t"+sResult.getSDept()+"\t"+sResult.getS1Marks()+"\t"+sResult.getS2Marks()+"\t"+sResult.getS3Marks()+"\t\t"+sResult.getS4Marks()+"\t"+sResult.getS5Marks()+"\t\t"+sResult.CalcTotal()+"\t"+sResult.CalcAverage()+"\t"+sResult.CalcGrade());
	
		
		scanner.close();
	}

}
