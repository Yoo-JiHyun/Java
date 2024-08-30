package Day03;

public class Ex12_For {
	
	public static void main(String[] args) {
		
		// for ( 1초기식 ; 2조건식 ; 4증감식 ) { 3실행문 }
		// - 실행 순서 : 1 -> 반복(2 -> 3 -> 4)
		
		// 1. 1~10 까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// 2. 50~100 까지 정수를 출력하시오.
		for (int a = 50; a <= 100; a++) {
			System.out.print(a + " ");
			// 10개씩 개행(엔터)하여 출력
			if( (a+1) % 10 == 0 )
				System.out.println();
		}
		System.out.println();
		
		// 3. 1~20 까지 정수 중 짝수만 출력하시오.
		for (int j = 2; j <= 20; j+=2) {
			System.out.print(j + " ");

		}
		System.out.println();
		
		// 4. 1~20 까지의 정수 중 홀수만 출력하시오.
		for (int z = 1; z < 20; z+=2) {
			System.out.print(z + " ");
			
		}
		System.out.println();
	}

}
