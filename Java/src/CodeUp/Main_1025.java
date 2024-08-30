package CodeUp;

import java.util.Scanner;

public class Main_1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String[] a = input.split("");
		
		String A = a[0];
		String B = a[1];
		String C = a[2];
		String D = a[3];
		String E = a[4];
		
		System.out.println("[" + A + "0000" + "]");
		System.out.println("[" + B + "000" + "]");
		System.out.println("[" + C + "00" + "]");
		System.out.println("[" + D + "0" + "]");
		System.out.println("[" + E + "]");
	
		
		sc.close();
	}
}
