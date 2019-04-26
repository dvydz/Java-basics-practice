package constructor;

public class Test {

	public static void main(String[] args) {
		
		EmployeeDetails obj=new EmployeeDetails();                //CONSTRUCTOR, UPDATING THE VALUES
		System.out.print("First Employee details");
		System.out.print("\n"+obj.getEmpName()+"\t");
		System.out.print(obj.getEmpID()+"\t");
		System.out.print(obj.getEmpDept()+"\t");
		System.out.println(obj.getEmpSalary());
		
		float newSalary=obj.getEmpSalary()+ (obj.getEmpSalary()*50/100);
		obj.setEmpSalary(newSalary);                     
		int newID=obj.getEmpID()+1;
		obj.setEmpID(newID);
				
		System.out.print("Second Employee details");
		EmployeeDetails obj2=new EmployeeDetails("Milan",12,5000,"BA");
		System.out.print("\n"+obj2.getEmpName()+"\t");
		System.out.print(obj2.getEmpID()+"\t");
		System.out.print(obj2.getEmpDept()+"\t");
		System.out.println(obj2.getEmpSalary());
		
		System.out.print("First Employee After update details");
		System.out.print("\n"+obj.getEmpName()+"\t");
		System.out.print(obj.getEmpID()+"\t");
		System.out.print(obj.getEmpDept()+"\t");
		System.out.println(obj.getEmpSalary());
		
				

	}

}
