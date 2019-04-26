/**
 * @author David
 * 
 */

package constructorsininheritance;

public class Employee {
	private int empId;
	private String empName;
	private String empDsg;
	
	public Employee()		//Parent class Default constructor
	{
		empId=0;
		empName="N/A";
		empDsg="N/A";
	}
	 public Employee(int empId,String empName,String empDsg)			//Parent Class Parameterized Constructor
	 {
		 this.empId=empId;
		 this.empName=empName;
		 this.empDsg=empDsg;
	 }
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDsg() {
		return empDsg;
	}
	public void setEmpDsg(String empDsg) {
		this.empDsg = empDsg;
	}
	

}
