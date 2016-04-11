/*
 * Calculadora por linea de comandos
 * Grupo HelloWorld
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static final String exitStatement = "exit";
	
	public static void main(String[] args) {
		Scanner sc = null;
		boolean exit = false;
		while(!exit){
			System.out.println("Ingrese la operacion a realizar (ecriba \"exit\" para salir): ");
			sc = new Scanner(System.in);
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
				try {
					resultado = calc.divide();
				} catch (InputMismatchException e) {
					System.out.printf("Formato incorrecto");
				}
			} else if (input.contains("%")) {
				try {
					resultado = calc.porcentaje();
				} catch (InputMismatchException e) {
					System.out.printf("Formato incorrecto");
				}
			} else if (input.trim().equalsIgnoreCase(exitStatement)){
				exit = true;
			} else {
				sc.close();
				throw new IllegalArgumentException("Operacion matematica erronea");
			}
			if(!exit){
				System.out.println(input+" = "+resultado);
//				System.out.printf("%n %s = %.2f %n", input, resultado);
			}
		}
		if(sc != null){
			System.out.println("Goodbye.");
			sc.close();
		}
	}

	private static String procesar(String input) { 	// agrega separadores entre
													// operadores
		input = input.replace("+", " + ");
		input = input.replace("-", " - ");
		input = input.replace("*", " * ");
		input = input.replace("%", " % ");
		input = input.replace("/", " / ");
		return input;
	}
}
