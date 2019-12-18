package pack;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="shan";
    String s2="shan";
    String s3=new String("shan");
    String s4="sourav";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    String s5="SHAN";
    System.out.println(s1.equalsIgnoreCase(s5));
   
	}

}
