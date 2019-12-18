package day5;

public class collinearSlop {
public static void iscolinear(int x1,int y1,int x2,int y2,int x3,int y3 ) {

	if((y2-y1)*(x2-x1)==(y3-y2)*(x3-x2)) 
		System.out.println("colinear");
	else 
		System.out.println("non colinear");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
iscolinear(1,1,0,1,6,9);
	}

}
