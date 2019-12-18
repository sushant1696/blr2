package Day1;

import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Year");
		int year=s.nextInt();
		if(year>1582)
		{
			if((year%400)==0 || year%4==0 && year%100!=0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("not leap year");
			}
				
		}
		else
		{
			System.out.println("you have entered wrong value");
		}
		
		
	}

}
