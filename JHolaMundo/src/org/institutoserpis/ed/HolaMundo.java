package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class HolaMundo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número ");
		String num1 = scanner.nextLine();
		BigDecimal primero = new BigDecimal(num1);
		System.out.print("Introduce otro número ");
		String num2 = scanner.nextLine();
		BigDecimal segundo = new BigDecimal(num2);
		BigDecimal suma = primero.add(segundo);
		System.out.println("El resultado de la suma es " + suma);
	}
}