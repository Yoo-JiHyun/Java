package CodeUp;

import java.util.Scanner;

public class Main_1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (int) Math.pow(2, b);
		
		System.out.println(a * c);
		
		sc.close();
	}
}
