//Single inheritance for only one execution.

package inheritance;

public class SingleInheritanceMain {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setSID(1);
		s1.setSName("Bishamta");
		s1.setLastName("Manandhar");
		s1.setSDept("Computer Science");
		s1.setAddress("Texas");
		s1.setEmailId("Bisham@gmail.com");
		s1.setContactNo(9874589756l);
		
		System.out.println("Student Details :");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("SId \t SName \t\t SLastName \t Address \t ContactNo	");
		System.out.println(s1.getSID()+"\t"+s1.getSName()+"\t"+s1.getLastName()+"\t"+s1.getAddress()+"\t\t"+s1.getContactNo());
		
		
		System.out.println(s1);
		
	}

}
