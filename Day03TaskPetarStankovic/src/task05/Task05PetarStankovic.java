package task05;
/*
 *  Napisati metodu koja ispituje da li je niz palindrom
 */

public class Task05PetarStankovic {

	public static void main(String[] args) {

		int[] niz = { 1, 2, 3, 3, 2, 1 };
		if (daLiJePalindrom(niz, 0, niz.length - 1)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Nije palindrom");
		}
	}

	static boolean daLiJePalindrom(int niz[], int pocetakNiza, int krajNiza) {
		if (niz.length == 1) {
			return true;
		}
		if (pocetakNiza >= krajNiza) {
			return true;
		}
		if (niz[pocetakNiza] == niz[krajNiza]) {
			return daLiJePalindrom(niz, pocetakNiza + 1, krajNiza - 1);
		} else {
			return false;
		}

	}
}
