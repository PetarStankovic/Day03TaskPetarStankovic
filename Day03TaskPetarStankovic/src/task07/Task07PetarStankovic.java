package task07;
/*
 * Napisati metodu koja vrsi inverziju niza.
 */

import java.util.Arrays;

public class Task07PetarStankovic {

	public static void main(String[] args) {

		int[] niz = { 1, 2, 3, 4, 5 };
		System.out.printf("%-17s %s\n", "Pre inverzije: ", Arrays.toString(niz));

		inverzijaNiza(niz);
		System.out.printf("%-17s %s\n", "Posle inverzije: ", Arrays.toString(niz));

	}

	static void inverzijaNiza(int[] niz) {
		for (int i = 0; i < niz.length / 2; i++) {
			int temp = niz[i];
			niz[i] = niz[niz.length - i - 1];
			niz[niz.length - i - 1] = temp;
		}
	}

}
