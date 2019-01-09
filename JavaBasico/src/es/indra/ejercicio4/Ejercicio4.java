package es.indra.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);

		int num;

		do {
			System.out.println("Introduce un entero");
			num = tec.nextInt();
		} while (num < 0);

		String numString = Integer.toString(num);
		System.out.println("Tiene " + numString.length() + " cifra/s");

	}

}
