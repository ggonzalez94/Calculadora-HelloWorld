package main;

import java.util.Scanner;

public class Calculadora {
	Scanner sc;

	public Calculadora(String input) {
		sc = new Scanner(input);
	}

	public float Suma() {
		sc.useDelimiter("\\+");
		float result = 0;
		while (sc.hasNext()) {
			result = result + sc.nextFloat();
		}
		sc.close();
		return result;
	}
	
	public float Resta(){
		sc.useDelimiter("\\-");
		float result = sc.nextFloat();
		while (sc.hasNext()) {
			result = result - sc.nextFloat();
		}
		sc.close();
		return result;
	}
	
	
}