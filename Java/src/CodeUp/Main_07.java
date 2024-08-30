package CodeUp;

import java.util.Scanner;

public class Main_07 {

	// 정수 n을 입력되고, n개의 데이터가 입력된다.
	// 이 n개의 데이터 중 최댓값을 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	sc.close();	
	}
	
	
}
