package Day2;

public class Stats {
	public static void main(String[] args) {
		Double x = Math.random();
		Double max = x;
		Double min = x;
		Double avg = 0.0;
				
		int count = 5;
		
		while (count> 0) {
			System.out.println(x);
			x = Math.random();
			max = Math.max(x, max);
			min = Math.min(x, min);
			avg = avg + x;
			count--;
		}
		System.out.println("max is :" +max);
		System.out.println("min is :" +min);
		System.out.println("avg is :" +avg/5);
	}
}
