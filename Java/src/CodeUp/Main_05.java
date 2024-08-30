package CodeUp;

import java.util.Scanner;

public class Main_05 {
	
	// 홀수면 "odd"을 출력하고, 짝수면 "even"을 출력하시오.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		sc.close();
	}

}
