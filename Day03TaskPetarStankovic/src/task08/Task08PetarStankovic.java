package task08;
/*
 * Dodati element u niz tako da niz ostane sortiran
 */

import java.util.Arrays;

class Array {

	public static int[] insert(int[] niz, int broj) {
		int[] noviNiz = new int[niz.length + 1];
		// TODO method
		return noviNiz;
	}
}

public class Task08PetarStankovic {

	public static void main(String[] args) {

		int[] niz = { 1, 3, 2 };
		System.out.println(Arrays.toString(niz));

		niz = Array.insert(niz, 4);
		System.out.println(Arrays.toString(niz));
	}
}
