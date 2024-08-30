package CodeUp;

import java.util.Scanner;

public class Main_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int x = Integer.parseInt(n, 16);
		
		System.out.printf("%o", x);
		
		sc.close();
	}
}
