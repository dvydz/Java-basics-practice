package constructor;

public class EmployeeDetails {
	private String empName;
	private int empID;
	private float empSalary;
	private String empDept;
	

	public EmployeeDetails(){                     //Default Constructor  
		empName="David";
		empID=369;
		empSalary=10000;								// Constructor Overloading
		empDept="IT";
	}
		
	public EmployeeDetails(String empName,int empID, float empSalary, String empDept)		//Parameterized constructor
	{
		this.empName=empName;
		this.empID=empID;
		this.empSalary=empSalary;
		this.empDept=empDept;
	}
		

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

