package Day2;

public class KInStarForm {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=9; i++) {
			
			for(int j=1;j<=10;j++) {
				
				if(i>2 && j>2 && i<5 && j<(9-i) || j>(11-i))
					System.out.print(" ");
				else
					System.out.print("*");
				
					if(i==5 & j<=i)
						
						System.out.print("*");
					if(i>2 && j>2 && i>5 && j<(i-1) || j>(i+1))
						System.out.print(" ");
					else
						System.out.print("*");
			}
			System.out.println();
		}
	}

}
