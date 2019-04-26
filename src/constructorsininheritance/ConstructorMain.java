/**
 * This is a static input for the package constructors_in_inheritance
 */

package constructorsininheritance;

public class ConstructorMain {

	public static void main(String[] args) {
		ContractEmployee obj=new ContractEmployee();
		System.out.println(obj.getEmpId()+"\t"+obj.getEmpName()+"\t"+obj.getEmpDsg()+"\t"+obj.getHours()+"\t"+obj.getRate()+"\t"+obj.calculatePayment(obj.getHours(),obj.getRate()));
		ContractEmployee obj2=new ContractEmployee(12,"David","Dsg",40,10);
		System.out.println(obj2.getEmpId()+"\t"+obj2.getEmpName()+"\t"+obj2.getEmpDsg()+"\t"+obj2.getHours()+"\t"+obj2.getRate()+"\t"+obj2.calculatePayment(obj2.getHours(),obj2.getRate()));
		
	}

}
