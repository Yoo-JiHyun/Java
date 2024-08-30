package CodeUp;

import java.util.Scanner;

public class Main_03 {
	
	public static void main(String[] args) {
		
		// 정수 계산에서 나머지를 구하시오.
		// Ex) 7 / 5 의 나머지는 2입니다.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a % b);
		
		sc.close();
	}
	

}
