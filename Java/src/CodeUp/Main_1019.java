package CodeUp;

import java.util.Scanner;

public class Main_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		String arr[] = day.split("\\.");
		
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		int C = Integer.valueOf(arr[2]);
		
				
		
		System.out.printf("%04d.%02d.%02d", A, B, C);
		
		sc.close();
	}
}
