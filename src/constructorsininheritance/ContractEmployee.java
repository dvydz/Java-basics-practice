/**
 * @author David
 */

package constructorsininheritance;

public class ContractEmployee extends Employee {
	
	private float hours;
	private float rate;
	
	public ContractEmployee()			//Child Class Default constructor
	{
		hours=20;
		rate=10;
	}
	
	/*
	 * If the constructor with all the variable is called during object creation, because empId and empName is already here in this constructor.
	 * We can use this(empId,empName) to call this constructor from the other constructor.
	 * Make sure this(empId,empName) is at the very first. Constructor call is always first
	 
	public ContractEmployee(int empId,String empName)
	{
		System.out.println("Yep this is implemented");
	}
	*/
	
	public ContractEmployee(int empId,String empName,String empDsg,float hours,float rate)				//Child Class Parameterized Constructor
	{
		super(empId,empName,empDsg);        //super calls parent class parameterized constructor with 3 arguments
		this.hours=hours;
		this.rate=rate;
	}
		
	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	float calculatePayment(float hours,float rate)
	{
		float pay=hours*rate;
		return pay;
	}

}
