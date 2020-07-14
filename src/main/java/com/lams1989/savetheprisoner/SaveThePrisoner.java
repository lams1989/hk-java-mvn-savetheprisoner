package com.lams1989.savetheprisoner;

public class SaveThePrisoner {
	// n 3: un número entero, el número de prisioneros
	// m 7: un número entero, la cantidad de dulces
	// s 3: un número entero, el número de la silla para comenzar a repartir dulces

	public static int saveThePrisoner(int n, int m, int s) {

		for (int i = 0; i < m; i++) {
			if (s == n) {
				s=1;
			}
			if (s + 1 > n) {
				s = 1;
			} else {
				s++;
			}

		}
		return s - 1;
	}
}
