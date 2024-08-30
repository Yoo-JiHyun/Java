package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
	
	public static void main(String[] args) {
		// 성적을 입력받아서, 성적에 따른 학점 A~F 를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		
		// * char grade = 'F';
		
		
		// 90점 이상, A
		if ( score >= 90 && score <= 100 )
		System.out.println(" A ");			// * grade = 'A';
		
		// 80점 이상, B
		else if ( score >=80 )
		System.out.println(" B ");			// * grade = 'B';
		
		// 70점 이상, C
		else if ( score >= 70 )
		System.out.println(" C ");			// * grade = 'C';
		
		// 60점 이상, D
		else if ( score >= 60 )
		System.out.println(" D ");			// * grade = 'D';
		
		// 60점 미만, F
		else 
			System.out.println(" F ");		// * grade = 'F';
		// * System.out.println("학점 : " + grade);
		sc.close();
		
	}

}
