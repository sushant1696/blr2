package Day2;

public class WindChil {  

	public static double result(double t,double v) {
		
		double w=35.74+.6215*t+(.4275*t-35.75)*Math.pow(v, 0.16);
		//return w;
 if((t>50 ) && (v>120||v<3 )) {
	 //double w=35.74+.6215*t+(.4275*t-35.75)*Math.pow(v, 0.16);
	return w;

	}
	}

public static void main(String args[]) {
	System.out.println(result(100,130));
}
}