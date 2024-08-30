package CodeUp;

import java.util.Scanner;

public class Main_1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int rem = a % b;
		double dou  = (double) a / b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		System.out.printf("%.2f", dou);
		
		sc.close();
	}
}
