
public class InnerClassExample {

	public static void main(String[] args) {
		InnerClassExample obj=new InnerClassExample();
		InnerClassExample.class2 obj2=obj.new class2(); // Object creation for inner class
		String name=obj2.name();
		System.out.println("The name is "+name);

	}
	
	public class class2{
		public String name()
		{
			String name="David";
			return name;
		}
	}

}
