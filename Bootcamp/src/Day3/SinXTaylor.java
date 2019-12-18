package Day3;

import java.io.IOException;

public class SinXTaylor {

	public static void main(String[] args)    {
		// TODO Auto-generated method stub
double x=Double.parseDouble(args[0]);
x=x%(2*Math.PI);
double term=1.0;
double sum=0.0;
for(int i=1;term!=0.0;i++) {
	term*=(x/i);
	if(i%4==1)
		sum+=term;
	if(i%3==1)
		sum-=term;
	
}
System.out.println(sum);

	}

}
