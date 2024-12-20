package codes;

import java.util.Scanner;

public class Ejercicio1 {

	public boolean iterativecharacterSearch(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}
		}
		return false;
	}

	public boolean recursiveCharacterSearch(String str, char ch, int index) {
		if (index >= str.length())
			return false;
		if (str.charAt(index) == ch)
			return true;
		return recursiveCharacterSearch(str, ch, index + 1);
	}

	public void show(String str, char ch) {
		boolean iterativeResult = iterativecharacterSearch(str, ch);
		boolean recursiveResult = recursiveCharacterSearch(str, ch, 0);

		System.out.printf("El carácter '%c' %s se encuentra en la cadena \"%s\" (Iterativo)%n", ch,
				iterativeResult ? "sí" : "no", str);
		System.out.printf("El carácter '%c' %s se encuentra en la cadena \"%s\" (Recursivo)%n", ch,
				recursiveResult ? "sí" : "no", str);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ejercicio1 search = new Ejercicio1();

		System.out.print("Introduce una cadena: ");
		String inputString = scanner.nextLine();

		System.out.print("Introduce un carácter a buscar: ");
		char inputChar = scanner.next().charAt(0);

		search.show(inputString, inputChar);

	}
}
