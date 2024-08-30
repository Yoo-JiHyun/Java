package Day13_14.Ex07_Compare;

import java.util.Scanner;

public class 마지막문제 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			
			int input = scanner.nextInt();
			
				
			switch (input) {
			case 1: 
				System.out.print("예금액 >");
				int in = scanner.nextInt();
				balance += in;
				break;
				
			case 2: 
				System.out.print("출금액 >");
				int out = scanner.nextInt();
				if( balance - out  < 0 ) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= out;
				}
				break;
			case 3:
				System.out.println("잔고 >" + balance);
				break;
				
			case 4:
				run = false;
				break;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
