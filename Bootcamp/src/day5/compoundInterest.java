package day5;

public class compoundInterest {
	public static double iscompound(int r,int C,int T) {
		double result =0;
		result =C*(Math.pow((1+r),T));
		
	
	return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(iscompound(5,100,1));
	}

}
