package task06;

import java.util.Arrays;

/*
 * Napisati metodu koja pomera sve elemente niza za jedno mesto u desno
 * Napisati metodu koja pomera sve elemente niza za N mesta u levo
 */

public class Task06PetarStankovic {

	public static void main(String[] args) {

		int[] niz = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		System.out.printf("%-25s %s\n", "Originalni niz: ", Arrays.toString(niz));
		pomeriUDesno(niz);
		System.out.printf("%-25s %s\n\n", "Nakon pomeranja u desno: ", Arrays.toString(niz));

		int[] niz2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.printf("%-25s %s\n", "Originalni niz: ", Arrays.toString(niz2));
		pomeriULevo(niz2, 3);
		System.out.printf("%-25s %s\n", "Nakon pomeranja u levo: ", Arrays.toString(niz2));
	}

	// pomeri u desno za jedno mesto
	static void pomeriUDesno(int[] niz) {
		int poslednjiBroj = niz[niz.length - 1];
		for (int i = niz.length - 1; i > 0; i--) {
			niz[i] = niz[i - 1];
		}
		niz[0] = poslednjiBroj;
	}

	// pomeri u levo za n mesta
	static void pomeriULevo(int[] niz, int brojMesta) {
		for (int j = 0; j < brojMesta; j++) {
			int temp = niz[0];
			for (int i = 0; i < niz.length - 1; i++) {
				niz[i] = niz[i + 1];
			}
			niz[niz.length - 1] = temp;
		}

	}
}
