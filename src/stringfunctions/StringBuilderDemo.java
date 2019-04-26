/**
 * StringBuilder demo
 */

package stringfunctions;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder build=new StringBuilder("OOPS");
		System.out.println(build);			//In StringBuilder once it runs, the string is updated
		build.append(" through Java");		//StringBuilder Adds String
		System.out.println(build); 			//As soon as .append runs, the String is updated
	
		System.out.println(build.insert(5, "HERE "));    //build.insert() inserts into string at the given index
		
		System.out.println(build.reverse());  //build.reverse() reverses the String. Directly String cannot be reversed
		
		// System.out.println(build.toString());	//(NEED TO LEARN) ***Converts StringBuilder back to string;*** 
	}

}
