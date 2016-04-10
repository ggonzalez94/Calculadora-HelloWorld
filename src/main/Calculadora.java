package main;

import java.util.Scanner;

public class Calculadora {
	Scanner sc;
	String input;
	float num;

	public Calculadora(String input) {
		sc = new Scanner(input);
	}

	public float sumaResta() {
		float result = sc.nextFloat();
		while (sc.hasNext()) {
			String op = sc.next();
			float B = sc.nextFloat();
			switch (op) {
			case "+":
				result = result + B;
				break;
			case "-":
				result = result - B;
				break;
			default:
				throw new IllegalArgumentException("Operador invalido.");
			}
		}
		sc.close();
		return result;
	}

	public float multiplica() {
		float result = sc.nextFloat();
		String op = sc.next();
		float B = sc.nextFloat();
		switch (op) {
		case "*":
			result = result * B;
			break;
		default:
			throw new IllegalArgumentException("Operador invalido.");
		}
		sc.close();
		return result;
	}
}
