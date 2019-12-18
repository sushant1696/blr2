package day8;

public class BinarySearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]= {1,4,5,6,3,24};
		int srch=61;
		//String arr[]= {"abc","bcd","cde","ab"};
		//String srch="ab";
				
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
		
			if(arr[mi]==srch) {
			System.out.println(mi);
	
		}
		else if(arr[mi]<srch)
		{
			li=mi+1;
		}
		else {
			hi=mi-1;
		}
		
		mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("elememt not found");
		}
	}

}
