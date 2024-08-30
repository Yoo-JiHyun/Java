package CodeUp;

import java.util.Scanner;

public class Main_14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int M = N / 2;
		
		for (int i = 0; i < N; i+=2) {
			for (int j = 0; j < M - i / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
