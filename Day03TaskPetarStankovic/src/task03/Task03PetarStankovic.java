package task03;

import java.util.Scanner;

/*
 * Napisati program/metodu koji racuna n-ti element Fibonacijevog niza
 */
public class Task03PetarStankovic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int broj;
		System.out.println("Unesite broj elementa Fibonacijevog niza: ");
		broj = sc.nextInt();
		sc.close();
		System.out.println("Vrednost " + broj + ". elementa Fib. niza je: " + zadatiFibElement(broj));
	}

	static int zadatiFibElement(int n) {
		if (n <= 1) {
			return n;
		}
		return zadatiFibElement(n - 1) + zadatiFibElement(n - 2);
	}

}
