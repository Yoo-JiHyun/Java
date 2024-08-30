package CodeUp;

import java.util.Scanner;

public class Main_1034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int o = Integer.parseInt(n, 8);
		
		System.out.printf("%d", o);
		
		sc.close();
	}
}
