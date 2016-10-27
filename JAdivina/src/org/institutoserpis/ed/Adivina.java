package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000);
		System.out.println("Adivina el numero ");
		Scanner scanner = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Introduce el número: ");
			String line = scanner.nextLine();
			numero = Integer.parseInt(line);
			if (numero < numeroAleatorio) 
				System.out.println("El numero es más alto");
			if (numero > numeroAleatorio)
				System.out.println("El numero es más bajo");
		} while (numero != numeroAleatorio);
		System.out.println("Lo adivinasteEEEEEEEEEEEEEEEEEEEEEEee!!!");
	}
}