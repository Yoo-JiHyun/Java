package CodeUp;

import java.util.Scanner;

public class Main_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long d = a + b + c;
		double e = (double) d / 3;
		
		System.out.println(d);
		System.out.printf("%.1f", e);
		
		sc.close();
		
	}
}
