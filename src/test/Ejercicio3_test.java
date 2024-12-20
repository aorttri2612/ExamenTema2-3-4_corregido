package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import codes.Ejercicio3;

class Ejercicio3_test {

	@Test
	void testEqualitiesWithValidSquareMatrix() {
		Ejercicio3 ejercicio = new Ejercicio3();

		// Matriz cuadrada donde filas y columnas son iguales
		int[][] matrix1 = { { 1, 2, 3 }, { 2, 5, 6 }, { 3, 6, 9 } };

		boolean[] expected1 = { true, true, true };
		boolean[] actual1 = ejercicio.equalities(matrix1);
		assertArrayEquals(expected1, actual1);

		// Matriz cuadrada donde filas y columnas no coinciden
		int[][] matrix2 = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 0, 1 } };

		boolean[] expected2 = { true, true, false };
		boolean[] actual2 = ejercicio.equalities(matrix2);
		assertArrayEquals(expected2, actual2);
	}

	@Test
	void testEqualitiesWithNonSquareMatrix() {
		Ejercicio3 ejercicio = new Ejercicio3();

		// Matriz no cuadrada debe lanzar una excepción
		int[][] nonSquareMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		assertThrows(IllegalArgumentException.class, () -> {
			ejercicio.equalities(nonSquareMatrix);
		});
	}

	@Test
	void testEqualitiesWithEmptyMatrix() {
		Ejercicio3 ejercicio = new Ejercicio3();

		// Matriz vacía debe devolver un array vacío
		int[][] emptyMatrix = new int[0][0];
		boolean[] expected = {};
		boolean[] actual = ejercicio.equalities(emptyMatrix);
		assertArrayEquals(expected, actual);
	}
}
