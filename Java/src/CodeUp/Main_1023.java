package CodeUp;

import java.util.Scanner;

public class Main_1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		String arrs[] = n.split("\\.");
		
		for (String arr : arrs) {
			System.out.println(arr);
		}
		sc.close();
	}
}
