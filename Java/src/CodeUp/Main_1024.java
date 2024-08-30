package CodeUp;

import java.util.Scanner;

public class Main_1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String[] Boy = input.split("");
		
		for (String Boys : Boy) {
			System.out.println("'" + Boys + "'");
		}
		sc.close();
		}
	}

