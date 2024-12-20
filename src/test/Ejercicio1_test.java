package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import codes.*;

public class Ejercicio1_test {

	Ejercicio1 exercise = new Ejercicio1();

	@ParameterizedTest
	@CsvSource({ "hola, a, h, l" })
	public void EstaEnLaCadena(String cadena, char caracter) {
		boolean actual = exercise.iterativecharacterSearch(cadena, caracter);
		assertTrue(actual);
		boolean actual1 = exercise.recursiveCharacterSearch(cadena, caracter, 0);
		assertTrue(actual1);
	}

	@ParameterizedTest
	@CsvSource({ "hola, i, , ''" })
	public void NoEstaEnLaCadena(String cadena, char caracter) {
		boolean actual = exercise.recursiveCharacterSearch(cadena, caracter, 0);
		assertFalse(actual);
		boolean actual2 = exercise.iterativecharacterSearch(cadena, caracter);
		assertFalse(actual2);
	}

}
