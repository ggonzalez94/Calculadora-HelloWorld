/*
 * Calculadora por linea de comandos
 * Grupo HelloWorld
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese la operacion a realizar: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = procesar(input);
		Calculadora calc = new Calculadora(input);
		float resultado = 0; // resultado de la operacion

		// Checkeo que operacion voy a realizar
		if (input.contains(" + ") || input.contains(" - ")) {
			try {
				resultado = calc.sumaResta();
			} catch (InputMismatchException e) {
				System.out.printf("Formato incorrecto");
			}
		} else if (input.contains(" * ")) {
			try {
				resultado = calc.multiplica();
			} catch (InputMismatchException e) {
				System.out.printf("Formato incorrecto");
			}
		} else if (input.contains("/")) {
			// resultado = calc.divide()
		} else if (input.contains("%")){
			try {
				resultado = calc.porcentaje();
			} catch (InputMismatchException e) {
				System.out.printf("Formato incorrecto");
			}
		} else {
			sc.close();
			throw new IllegalArgumentException("Operacion matematica erronea");
		}
		sc.close();
		System.out.printf("%nEl resultado es: %.2f", resultado);
	}

	private static String procesar(String input) { 	// agrega separadores entre
													// operadores
		input = input.replace("+", " + ");
		input = input.replace("-", " - ");
		input = input.replace("*", " * ");
		input = input.replace("%", " % ");
		return input;
	}
}
