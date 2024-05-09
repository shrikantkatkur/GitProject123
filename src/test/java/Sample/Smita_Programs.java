package Sample;

import java.util.Scanner;

public class Smita_Programs {
	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();

			if (a % 3 == 0) {
				System.out.println("Hello");
			} else if (a % 5 == 0) {
				System.out.println("Hi");
			} else if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("Haha!!");
			}else {
				System.out.println("Invalid Input");
			}
		}

	}
}
