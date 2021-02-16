package task01;

import java.util.Scanner;

/*
 * Napisati program koji od n unetih brojeva nalazi najveci
 */
public class Task01PetarStankovic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		int broj;
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			System.out.printf("Unesite %d. broj: \n", i);
			broj = sc.nextInt();
			if (broj > max)
				max = broj;
		}

		System.out.println("Najveci broj je: " + max);
		sc.close();
	}

}
