package CodeUp;

import java.util.Scanner;

public class Main_02 {
	
	public static void main(String[] args) {
		
		
		// 두 정수를 입력받아 아래와 같이 출력하시오.
		// a , b
		// a+b, a-b, a*b, a/b
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		
		System.out.println( a + "+" + b + "=" + c);
		System.out.println( a + "-" + b + "=" + d);
		System.out.println( a + "*" + b + "=" + e);
		System.out.println( a + "/" + b + "=" + f);
		
	sc.close();	
	}
	
	

}
