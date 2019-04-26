/**
 * @author David
 */
// The same thing is done in package MyCoreJavaClass with more accuracy with the help of Tutor

package inheritancehierarchial;

public class ContractEmployee extends Employee {
	
	private float hours;
	private float rate;
		
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
