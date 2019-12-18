package Day1;
import java.lang.Math;
public class Distance {
		
	public static void main(String[] args) {
		System.out.println("enter x");
		int x=Integer.parseInt(args[0]);
		System.out.println("enter y");
		int y=Integer.parseInt(args[1]);
		int result=x*x+y*y;
		double Distance=0.0;
		Distance=Math.sqrt(result);
		System.out.println("Distance is="+Distance);
	}

}
