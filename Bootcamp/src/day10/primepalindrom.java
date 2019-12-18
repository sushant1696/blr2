package day10;

import java.util.Scanner;

public class primepalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the start number :");
		int num = obj.nextInt();
		System.out.println("enter the end number :");
		int num1 = obj.nextInt();
		int count = 0;
		int sum=0;
		for (int i=num ; i<=num1 ; i++) {
			count=0;
			int n=i;
			for(int j=2 ; j<=i/2 ; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			while(n>0) {
				int r=n%10;
				 sum=sum*10+r;
				n=n/10;
				
				
			}
			if(count == 2 && sum==i) {
				System.out.println(i+" ");
			}
			
		}
	}

}
