package CodeUp;

import java.util.Scanner;

public class Main_1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		
		String[] min = time.split("\\:");
		
		String b = min[1];
		
		if ( b.equals("00")) {
			b = "0";
		}
			System.out.println(b);
		
		sc.close();
	}
}
