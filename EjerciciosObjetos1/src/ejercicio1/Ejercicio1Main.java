package ejercicio1;

import java.util.Scanner;

public class Ejercicio1Main {

	private static Scanner entrada;
	private static Cuenta cuenta;

	public static void inicializar() {
		entrada = new Scanner(System.in);
		cuenta = null;
	}

	public static void main(String[] args) {

		inicializar();

		int opcion = 0;
		do {
			System.out.flush();
			System.out.println("Introduzca la operación que desee realizar:");
			System.out.println("1. Inicializar cuenta.");
			System.out.println("2. Añadir saldo.");
			System.out.println("3. Retirar saldo.");
			System.out.println("0. Salir.");
			opcion = entrada.nextInt();
			entrada.nextLine();

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
			Double saldo = entrada.nextDouble();
			cuenta.retirar(saldo);
			System.out.println("El resultado de la operación es: " + cuenta.toString());
		} else {
			System.out.println("Debe inicializar la cuenta primero");
		}

	}

	private static void aniadirSaldo() {
		if (cuenta != null) {
			System.out.println("Introduzca la cantidad que desee añadir:");
			Double saldo = entrada.nextDouble();
			cuenta.ingresar(saldo);
			System.out.println("El resultado de la operación es: " + cuenta.toString());
		} else {
			System.out.println("Debe inicializar la cuenta primero");
		}
	}

	private static void inicializarCuenta() {
		System.out.println("Introduzca nombre del titular:");
		String titular = entrada.nextLine();
		System.out.println("Introduzca la cantidad:");
		double saldo = entrada.nextDouble();
		cuenta = new Cuenta(titular, saldo);
		System.out.println("El resultado de la operación es: " + cuenta.toString());
	}

}
