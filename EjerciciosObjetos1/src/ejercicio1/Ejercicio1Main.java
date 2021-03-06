package ejercicio1;

import java.util.Scanner;

public class Ejercicio1Main {

	private static Scanner ENTRADA;
	private static Cuenta cuenta;

	public static void inicializar() {
		ENTRADA = new Scanner(System.in);
		cuenta = null;
	}

	public static void main(String[] args) {

		inicializar();

		int opcion = 0;
		do {
			System.out.println("Introduzca la operaci�n que desee realizar:");
			System.out.println("1. Inicializar cuenta.");
			System.out.println("2. A�adir saldo.");
			System.out.println("3. Retirar saldo.");
			System.out.println("0. Salir.");
			opcion = ENTRADA.nextInt();
			ENTRADA.nextLine();

			switch (opcion) {
			case 1:
				inicializarCuenta();
				break;
			case 2:
				aniadirSaldo();
				break;
			case 3:
				retirarSaldo();
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				break;
			}
		} while (opcion != 0);
	}

	private static void retirarSaldo() {
		if (cuenta != null) {
			System.out.println("Introduzca la cantidad que desee retirar:");
			Double saldo = ENTRADA.nextDouble();
			cuenta.retirar(saldo);
			System.out.println("El resultado de la operaci�n es: " + cuenta.toString());
		} else {
			System.out.println("Debe inicializar la cuenta primero");
		}

	}

	private static void aniadirSaldo() {
		if (cuenta != null) {
			System.out.println("Introduzca la cantidad que desee a�adir:");
			Double saldo = ENTRADA.nextDouble();
			cuenta.ingresar(saldo);
			System.out.println("El resultado de la operaci�n es: " + cuenta.toString());
		} else {
			System.out.println("Debe inicializar la cuenta primero");
		}
	}

	private static void inicializarCuenta() {
		System.out.println("Introduzca nombre del titular:");
		String titular = ENTRADA.nextLine();
		System.out.println("Introduzca la cantidad:");
		double saldo = ENTRADA.nextDouble();
		cuenta = new Cuenta(titular, saldo);
		System.out.println("El resultado de la operaci�n es: " + cuenta.toString());
	}

}
