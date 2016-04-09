package main;

import java.util.Scanner;

public class Calculadora {
	Scanner sc;
	String input;
	float num;

	public Calculadora(String input) {
		sc = new Scanner(input);
		this.input = input.replaceAll("\\s", "");
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

			}
		}
		sc.close();
		return result;
	}
}