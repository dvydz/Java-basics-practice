/**
 * Getters and Setters concept, Using Test.java from p1 package
 * Employee details
 */

package employee;

public class EmployeeDetails {
	private String empName;
	private int empID;
	private float empSalary;
	private String empDept;
	

	/*                                                  //Checking Static block
	 static 
	{
		System.out.println("System is loading.....");
	}
	*/

	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary=empSalary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	
	

}
