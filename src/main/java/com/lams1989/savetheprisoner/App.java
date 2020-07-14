package com.lams1989.savetheprisoner;

public class App {
	public static void main(String[] args) {
		// t : el nunmero de pruebas
		// T : linea con tres enteros n, m, s
		// n : un número entero, el número de prisioneros
		// m : un número entero, la cantidad de dulces
		// s : un número entero, el número de la silla para comenzar a repartir dulces

	
		System.out.println("espero= 2  pero da: " + SaveThePrisoner.saveThePrisoner(5, 2, 1));
		System.out.println("espero= 3  pero da: " + SaveThePrisoner.saveThePrisoner(5, 2, 2));
		System.out.println("espero= 6  pero da: " + SaveThePrisoner.saveThePrisoner(7, 19, 2));
		System.out.println("espero= 3  pero da: " + SaveThePrisoner.saveThePrisoner(7, 3, 7));
	}
}
