/**
 * Concat demo
 */

package stringfunctions;

public class ConcatDemo {

	public static void main(String[] args) {
		String course="OOPS";
		System.out.println(course);
		System.out.println(course.concat(" through Java"));  // Adds Strings. 
		course=course.concat(" through Java");				 // course=__________  updates the course, but only course.______ only prints
		System.out.println(course);							 // Returns String
		

	}

}
