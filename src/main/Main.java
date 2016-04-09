package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la suma: ");
		String input = sc.nextLine();
		Calculadora calc = new Calculadora(input);
		float resultado;
		resultado = calc.Suma();
		sc.close();
		System.out.printf("%n%f", resultado);
	}
}
