/*
 * Calculadora por linea de comandos
 * Grupo HelloWorld
 */
package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Ingrese la operacion a realizar: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Calculadora calc = new Calculadora(input);
		float resultado = 0; //resultado de la operacion
		//Checkeo que operacion voy a realizar
		if (input.contains("+")){
			resultado = calc.Suma();
		}
		else if(input.contains("-")){
			//resultado = calc.Resta();
		}
		else if(input.contains("*")){
			//resultado = calc.Multiplica();
		}
		else if(input.contains("/")){
			//resultado = calc.Divide()
		}
		else{
			//resultado = calc.Modulo();
		}
		sc.close();
		System.out.printf("%n%f", resultado);
	}
}
