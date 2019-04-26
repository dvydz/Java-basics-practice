package stringfunctions;

public class SplitDemo {

	public static void main(String[] args) {
		String string="David,Bishamta,Milan,Shristi";
		System.out.println(string);						//string.split("_") splits the string into several strings separated by given character and stores in an array
		String list[]=string.split(",");				//for loop required to display all the split words
		for(int i=0;i<list.length;i++)					//Returns String
		{
			System.out.println(list[i]+" ");
		}

	}

}
