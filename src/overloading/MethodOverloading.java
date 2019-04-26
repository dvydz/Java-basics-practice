//This is static check for method overloading. Nothing to do with other classes

package overloading;

public class MethodOverloading {
	
	void input(String message)
	{
		System.out.println("String input");
	}
	
	void input(int number)
	{
		System.out.println("Int input");
	}
	
	void input(float value)
	{
		System.out.println("Float input");
	}
	
	void input(double value)
	{
		System.out.println("Double input");
	}
	
	void input(long value)
	{
		System.out.println("Long input");
	}

	void add(int a, float b)
	{
		System.out.println("Int a + Float b is "+(a+b));
	}
	void add(float a, int b)
	{
		System.out.println("Float a + Int b is "+(a+b));
	}
	public static void main(String[] args) {
	
		MethodOverloading obj1=new MethodOverloading();
	
	obj1.input(5.5);
	obj1.input(5.5f);
	obj1.input("David");
	obj1.input(5);
	obj1.input(5l);
	obj1.add(5,5.5f);
	obj1.add(5.5f, 5);

	}

}
