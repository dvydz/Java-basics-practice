/**
 * A demo of Override function for Object when comments are removed
 */

package inheritance;

public class Student extends PersonalDetails {

	private int sID;
	private String sName;
	private String sDept;
//	public String className="Student.class";
	public int getSID() {
		return sID;
	}
	public void setSID(int sID) {
		this.sID = sID;
	}
	public String getSName() {
		return sName;
	}
	public void setSName(String sName) {
		this.sName = sName;
	}
	public String getSDept() {
		return sDept;
	}
	public void setSDept(String sDept) {
		this.sDept = sDept;
	}
	
/*	@Override
	public String toString() {										//Override function for object. Child class toString has priority over parent's
		return "\n"+className+"\t"+super.className;					// Need to use super. to access the parent class toString
	}
*/	
}
