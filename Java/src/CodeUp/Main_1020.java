package CodeUp;

import java.util.Scanner;

public class Main_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String arrs[] = num.split("\\-");
		
		for (String arr : arrs) {
			System.out.print(arr);
		}
		sc.close();
	}
}
