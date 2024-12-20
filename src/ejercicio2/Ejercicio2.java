package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public void hourglass(int n) {
		if (n <= 0 || n % 2 == 0) {
			throw new IllegalArgumentException("El número debe ser positivo e impar.");
		}

		// Parte superior
		for (int i = n; i >= 1; i -= 2) {
			printSpaces((n - i) / 2);
			printStars(i);
		}

		// Parte inferior
		for (int i = 3; i <= n; i += 2) {
			printSpaces((n - i) / 2);
			printStars(i);
		}
	}

	private void printSpaces(int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(" ");
		}
	}

	private void printStars(int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("*");
		}
		System.out.println();
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Ejercicio2 hourglass = new Ejercicio2();

		System.out.print("Introduce un número impar positivo para el reloj de arena: ");
		int n = scanner.nextInt();

		hourglass.hourglass(n);

	}
}
