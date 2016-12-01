package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class JSuma {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Primer número: ");
		String numero1 = scan.nextLine();
		BigDecimal primero = new BigDecimal(numero1);
		System.out.print("Segundo número: ");
		String numero2 = scan.nextLine();
		BigDecimal segundo = new BigDecimal(numero2);
		BigDecimal suma = primero.add(segundo);
		System.out.println(primero + " + " + segundo + " = " + suma);
	}

}
