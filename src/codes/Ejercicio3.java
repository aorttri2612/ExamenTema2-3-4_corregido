package codes;

import java.util.Scanner;

public class Ejercicio3 {

	public boolean[] equalities(int[][] matrix) {
		int n = matrix.length;

		for (int[] row : matrix) {
			if (row.length != n) {
				throw new IllegalArgumentException("La matriz no es cuadrada.");
			}
		}

		boolean[] results = new boolean[n];

		for (int i = 0; i < n; i++) {
			results[i] = isRowEqualToColumn(matrix, i);
		}

		return results;
	}

	private boolean isRowEqualToColumn(int[][] matrix, int index) {
		int n = matrix.length;

		for (int j = 0; j < n; j++) {
			if (matrix[index][j] != matrix[j][index]) {
				return false;
			}
		}

		return true;
	}

	public void show(int[][] matrix) {
		boolean[] results = equalities(matrix);

		for (int i = 0; i < results.length; i++) {
			System.out.printf("La fila %d %s igual a la columna %d%n", i + 1, results[i] ? "es" : "no es", i + 1);
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ejercicio3 equalities = new Ejercicio3();

		System.out.print("Introduce el tamaño de la matriz cuadrada (N x N): ");
		int n = scanner.nextInt();

		int[][] matrix = new int[n][n];
		System.out.println("Introduce los elementos de la matriz:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
				matrix[i][j] = scanner.nextInt();
			}
		}

		equalities.show(matrix);

	}
}
