package CodeUp;

import java.util.Scanner;

public class Main_1072 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int size = sc.nextInt();
		int[] num = new int[size];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
