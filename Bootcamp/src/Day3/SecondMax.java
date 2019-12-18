package Day3;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,3,5,6,8};
int max=a[0];
int secondMax=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i];
	}
	else if(a[i]>secondMax) {
		secondMax=a[i];
	}
}
	System.out.println(max);
}
	
	}


