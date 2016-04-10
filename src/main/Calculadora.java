package main;

import java.util.Scanner;

public class Calculadora {
	Scanner sc;
	String input;

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
		if (sc.hasNext())
			throw new IllegalArgumentException(
					"No se aceptan mas de dos operandos.");
		sc.close();
		return result;
	}

	public float porcentaje() {
		float result = sc.nextFloat();
		String op = sc.next();
		float B = sc.nextFloat();
		switch (op) {
		case "%":
			result = result * B / 100;
			break;
		default:
			throw new IllegalArgumentException("Operador invalido.");
		}
		if (sc.hasNext())
			throw new IllegalArgumentException(
					"No se aceptan mas de dos operandos.");
		sc.close();
		return result;
	}

	public float divide() {
		float result = sc.nextFloat();
		String op = sc.next();
		float B = sc.nextFloat();
		if (B == 0) {
			throw new IllegalArgumentException("No se puede dividir por 0");
		}
		switch (op) {
		case "/":
			result = result / B;
			break;
		default:
			throw new IllegalArgumentException("Operador invalido.");
		}
		if (sc.hasNext())
			throw new IllegalArgumentException(
					"No se aceptan mas de dos operandos.");
		sc.close();
		return result;
	}
}
