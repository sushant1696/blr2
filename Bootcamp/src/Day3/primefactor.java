package Day3;
import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("enter the value of n");
int n=obj.nextInt();
for(int i=2;i<=n;i++) {
	while(n%i==0) {
		System.out.println(i);
		n=n/i;
		
	}
	if(n>2) {
		System.out.println("prime factor of n is:" +n);
	}
}
	}

}
