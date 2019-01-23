package practice_Java;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("give me the number:");
		n = scanner.nextInt();
		a = n;
		for (i = n - 1; i > 0; i--) {
			a = a * i;

		}
		System.out.println("Factorial of " + n + " is " + a);

		reverse_string s1 = new reverse_string();
		s1.reverse();
		s1.arrayTest();
	}

}
