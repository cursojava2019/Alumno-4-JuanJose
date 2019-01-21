package es.indra.view;

import java.util.Scanner;

import es.indra.controller.Banco;
import es.indra.model.Cliente;
import es.indra.model.Cuenta;

public class ProgramaBanco {

	private static Scanner ENTRADA;

	private static Banco banco = null;

	public static void main(String[] args) {

		ENTRADA = new Scanner(System.in);
		banco = new Banco();

		System.out.println("Bienvenido al Banco");
		int opcion = 0;
		do {
			System.out.println("Introduzca la operaci�n que desee realizar:");
			System.out.println("1. Introducir cliente.");
			System.out.println("2. Crear una cuenta.");
			System.out.println("3. Ingresar dinero en una de las cuentas del cliente.");
			System.out.println("4. Sacar dinero en una de las cuentas del cliente.");
			System.out.println("5. Revisi�n mensual de las cuentas.");
			System.out.println("6. Estado de una cuenta bancaria.");
			System.out.println("0. Salir.");
			opcion = ENTRADA.nextInt();
			ENTRADA.nextLine();

			switch (opcion) {
			case 1:
				aniadirCliente();
				break;
			case 2:
				crearCuenta();
				break;
			/*
			 * case 3: ingresarDinero(); break; case 4: sacarDinero(); break; case 5:
			 * revisionMensual(); break; case 6: estadoCuenta(); break;
			 */
			case 0:
				System.out.println("Fin del programa");
			default:
				break;
			}
		} while (opcion != 0);

	}

	// IT WORKS
	public static void aniadirCliente() {
		System.out.println("Introduzca los datos del cliente");
		System.out.println("Introduzca el dni y pulse intro");
		String dni = ENTRADA.nextLine();
		System.out.println("Introduzca el nombre y pulse intro");
		String nombre = ENTRADA.nextLine();
		System.out.println("Introduzca apellidos y pulse intro");
		String apellidos = ENTRADA.nextLine();
		System.out.println("Introduzca la direcci�n y pulse intro");
		String direccion = ENTRADA.nextLine();
		System.out.println("Introduzca el tel�fono y pulse intro");
		String telefono = ENTRADA.nextLine();
		Cliente cliente = new Cliente(dni, nombre, apellidos, telefono, direccion);
		System.out.println("Cliente introducido correctamente");

	}

	// Probar, no puede crear la cuenta
	public static void crearCuenta() {
		System.out.println("Introduzca los datos de la cuenta");
		System.out.println("Introduzca el tipo de cuenta y pulse intro:");
		String tipo = ENTRADA.nextLine();
		System.out.println("Introduzca la comisi�n y pulse intro:");
		Float comision = ENTRADA.nextFloat();
		ENTRADA.nextLine();
		System.out.println("Introduzca el saldo y pulse intro:");
		Double saldo = ENTRADA.nextDouble();
		ENTRADA.nextLine();
		System.out.println("Introduzca el dni del cliente y pulse intro:");
		String dni = ENTRADA.nextLine();

		Cliente cliente = banco.obtenerCliente(dni);

		// no me lo instancia, error en clase Banco
		Cuenta cuenta = new Cuenta(1, tipo, comision, saldo, cliente, false);
	}

	public static void ingresarDinero() {
		// llamar m�todo ingresardinero
	}

	public static void sacarDinero() {
		// llamar m�todo sacardinero }
	}

	public static void revisionMensual() {
		// llamar el m�todo revisionMensual
	}

	public static void estadoCuenta() {

	}

}
