package day5;

public class prime {
	//int count = 0;
	public static boolean isprime(int n) {
		int count = 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				count ++;
			
			if(count==0)
				return true;
			
				//return true;
			
			//return false;
		}
		return false;
		
		//return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(isprime(19)) {
		System.out.println("prime");
	}
else
{
	System.out.println("no prime");
	
}
	
}
	

}
