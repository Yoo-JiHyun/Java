package CodeUp;

import java.util.Scanner;

public class Main_06 {

	// 어떤 두 수 a,b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b) {
			// i : 1  b : 1
			// i : 2  b : 2
			// i : 3  b : 3
			
			// i < 3
			for (int i = b; i <= a; i++) {
				System.out.print(i + " ");

			}
		}
		else if (a < b) {
			// j : 1
			// j : 2
			// j : 3
			// j <= 3
			for (int j = a; j <= b; j++) {
				System.out.print(j + " ");

			}
		} else {
			System.out.print(a);

		}

		sc.close();

	}

}	
