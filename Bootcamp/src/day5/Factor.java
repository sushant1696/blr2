package day5;

public class Factor {
	public static int isfactor(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			 fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isfactor(3));
	}

}
