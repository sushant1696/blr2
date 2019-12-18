package day9;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the user name");
		String username=obj.nextLine();
		System.out.println(" enter the user phone no");
		String phoneno=obj.nextLine();
		System.out.println("enter the emailId ");
		String email=obj.nextLine();
		System.out.println("company name");
		String comp=obj.nextLine();
		System.out.println("username"+Pattern.matches("[a-zA-Z]+",username));
		System.out.println("phoneno"+Pattern.matches("[(0|9)?[7-9][0-9]{9}",phoneno));
		System.out.println("email"+Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+",email));
		System.out.println(""+Pattern.matches("[a-zA-Z]+",comp));
	    obj.close();
	}
	

}


