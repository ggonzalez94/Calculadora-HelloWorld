package main;

import java.util.Scanner;

public class Calculadora {
	String input;

	public Calculadora(String input) {
		this.input = input;
	}

	public float Suma() {
		Scanner sc = new Scanner(input);
		sc.useDelimiter("\\+");
		float result = 0;
		while (sc.hasNext()) {
			result = result + sc.nextFloat();
		}
		sc.close();
		return result;
	}
}