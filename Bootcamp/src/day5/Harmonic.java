package day5;
import java.io.*;
public class Harmonic {
	// double sum=0,n=5;
	 static double isharmonic(int n) {
		double sum=0.0;
		
		for(int i=1;i<=n;i++) {
			
		sum=sum+(1/n);
		return sum;
		}
	}

	public static void main(String[] args) {
		

	System.out.println(isharmonic(5));

	}

}
