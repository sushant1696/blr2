package Day4;

public class EqualsString {
public static boolean equal(String s1,String s2) {
	if(s1==null|| s2==null) {
		return false;
	}
	if(s1.length()!=s2.length()) {
		return false;
	}
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!=s2.charAt(i))
		{
			return false;
		}
	}
	
		return true;
	
		
	
}

public static void main(String args[]) {
	String s1="shana";
	String s2="shan";
	System.out.println(equal(s1,s2));
}
}