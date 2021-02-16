package task04;

import java.util.Arrays;

/*
 * Napraviti metodu koja najveci element niza zamenjuje sa -1
 * Ako tih elemenata ima vise sve ih zameniti sa -1
 */
class Array {

	static int max(int[] niz) {
		int max = niz[0];
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > max) {
				max = niz[i];
			}
		}
		return max;
	}

	static int[] replaceMaxNumWithMinusOne(int[] niz) {
		int max = max(niz);
		for (int i = 0; i < niz.length;) {
			if (niz[i] == max) {
				niz[i] = -1;
			}
			break;
		}
		return niz;
	}

	static int[] replaceAllMaxWithMinusOne(int[] niz) {
		int max = max(niz);
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == max) {
				niz[i] = -1;
			}
		}
		return niz;
	}

	// dodatni metod sa casa: zeljeni broj u nizu = novi zeljeni broj
	static int[] replaceAnyNum(int[] niz, int requestedNum, int newNumber) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == requestedNum) {
				niz[i] = newNumber;
			}
		}
		return niz;
	}
}

public class Task04PetarStankovic {

	public static void main(String[] args) {
		int[] niz = { 14, 5, 3, 3, 4, 7, 5, 1, 9, 9, 14, 12, 1, 7 };

		System.out.println("Originalni niz: \n" + Arrays.toString(niz));

		System.out.println("\nNiz gde -1 menja jedan/prvi najveci element: \n"
				+ Arrays.toString(Array.replaceMaxNumWithMinusOne(niz)));

		System.out.println(
				"\nNiz gde -1 menja sve najvece elemente: \n" + Arrays.toString(Array.replaceAllMaxWithMinusOne(niz)));

		System.out.println("\nNiz gde zeljeni broj menja sve elemente:  \n"
				+ Arrays.toString(Array.replaceAnyNum(niz, Array.max(niz), -3)));
	}

}
