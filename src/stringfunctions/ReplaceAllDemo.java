package stringfunctions;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		String string="Hello Hello Dont know why you say goodbye I say Hello";
		System.out.println(string);				
		System.out.println(string.replaceAll("Hello","Hi"));	//string.replaceAll(_,_) replaces all of a certain word in string with some other word		
																//Returns String
	}

}
