package reverse;

public class Reverses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*  StringBuffer s1=new StringBuffer("sham");
  System.out.println(s1.reverse());*/
		
		String s1="sushanta";
		int length=s1.length();
		String rev="   ";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		
	}

}
