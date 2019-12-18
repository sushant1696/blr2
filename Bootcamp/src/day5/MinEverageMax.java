package day5;

public class MinEverageMax {
public static int ismax(int arr[]) {
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		//return max;	
	}
	return max;
}
public static int ismin(int arr[]) {
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		//return max;	
	}
	return min;
}

public static float isevrg(int arr[]) {
	float evr=0;
	for(int i=0;i<arr.length;i++) {
		evr+=arr[i];
		}
	
	return evr/arr.length ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,5,8,32,6};
System.out.println(ismax(arr));
System.out.println(ismin(arr));
System.out.println(isevrg(arr));
	}

}
`	 