package multilevelinheritance;

public class StudentResult extends StudentMarks {
	private int total;
	private float avg;
	private String grade;
	StudentMarks sMarks=new StudentMarks();
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
		public int CalcTotal()
		{
			total=getS1Marks()+getS2Marks()+getS3Marks()+getS4Marks()+getS5Marks();
			return total;
		}
		public float CalcAverage()
		{
			float avg=(float)total/(float)5;     //Divison of two int will produce Int even if we have the variable 
			return avg;					//set as float. Thats why we need to typecast (float)
		}
		
		public String CalcGrade()
		{
			String grade=null;
			if(getS1Marks()<60||getS2Marks()<60||getS3Marks()<60||getS4Marks()<60||getS5Marks()<60)
				grade="Fail";
			else if(total>=450)
				grade="A";
			else if(total>=400)
				grade="B";
			else if(total>=350)
				grade="C";
			else if(total>=300)
				grade="D";
			return grade;
			
		}

}
