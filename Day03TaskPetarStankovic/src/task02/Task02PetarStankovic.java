package task02;

import java.util.Scanner;

/*
 * Napisati program koji od n unetih brojeva prikazuje najveci broj koji je deljiv sa zbirom
 * svojih cifara
 */
public class Task02PetarStankovic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		int broj;
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			System.out.printf("Unesite %d. broj: \n", i);
			broj = sc.nextInt();
			if (deljivSaZbiromCifara(broj) && broj > max)
				max = broj;
		}
		System.out.println("Najveci broj deljiv sa zbirom svojih cifara je: " + max);
		sc.close();
	}

	static boolean deljivSaZbiromCifara(int broj) {
		int tempBroj = broj;
		int zbirCifara = 0;

		while (broj != 0) {
			zbirCifara = zbirCifara + (broj % 10);
			broj = broj / 10;
		}
		return tempBroj % zbirCifara == 0;
	}

}
