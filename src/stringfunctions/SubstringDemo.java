package stringfunctions;

public class SubstringDemo {

	public static void main(String[] args) {
		String string="Hello Hello Dont know why you say goodbye I say hello";
		System.out.println(string);						
		System.out.println(string.substring(12,25));	//string.substring(_,_) displays string from begin_index to end_index
		System.out.println(string.substring(12));		//string.substring(_) displays string from begin_index to the very end of the string
														//Returns string

	}

}
