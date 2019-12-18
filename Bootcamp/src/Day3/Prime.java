package Day3;
import java.util.Scanner;

public class Prime{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the start number :");
		int num = obj.nextInt();
		System.out.println("enter the end number :");
		int num1 = obj.nextInt();
		int count = 0;
		for (int i=num ; i<=num1 ; i++) {
			count=0;
			for(int j=2 ; j<=i/2 ; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(i+" ");
			}
			
		}
		
	}

}
