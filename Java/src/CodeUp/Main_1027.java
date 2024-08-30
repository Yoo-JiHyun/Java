package CodeUp;

import java.util.Scanner;

public class Main_1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		
		String[] cal = day.split("\\.");
		
		
		String a = cal[0];
		String b = cal[1];
		String c = cal[2];
		
		System.out.println(c + "-" + b + "-" + a);
	
		sc.close();
	}
	
}
