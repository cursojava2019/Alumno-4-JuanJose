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
			System.out.println("Introduzca la operación que desee realizar:");
			System.out.println("1. Introducir cliente.");
			System.out.println("2. Crear una cuenta.");
			System.out.println("3. Ingresar dinero en una de las cuentas del cliente.");
			System.out.println("4. Sacar dinero en una de las cuentas del cliente.");
			System.out.println("5. Revisión mensual de las cuentas.");
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
			case 3:
				ingresarDinero();
				break;
			case 4:
				sacarDinero();
				break;
			case 5:
				revisionMensual();
				break;
			case 6:
				estadoCuenta();
				break;
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
		System.out.println("Introduzca la dirección y pulse intro");
		String direccion = ENTRADA.nextLine();
		System.out.println("Introduzca el teléfono y pulse intro");
		String telefono = ENTRADA.nextLine();

		Cliente cliente = new Cliente(dni, nombre, apellidos, telefono, direccion);

		banco.introducirCliente(cliente);

		System.out.println("Cliente introducido correctamente");

	}

	// IT WORKS
	public static void crearCuenta() {
		System.out.println("Introduzca los datos de la cuenta");
		System.out.println("Introduzca el código de la cuenta y pulse intro:");
		Long codigo = ENTRADA.nextLong();
		ENTRADA.nextLine();
		System.out.println("Introduzca el tipo de cuenta y pulse intro:");
		String tipo = ENTRADA.nextLine();
		System.out.println("Introduzca la comisión y pulse intro:");
		Float comision = ENTRADA.nextFloat();
		ENTRADA.nextLine();
		System.out.println("Introduzca el saldo y pulse intro:");
		Double saldo = ENTRADA.nextDouble();
		ENTRADA.nextLine();
		System.out.println("Introduzca el dni del cliente y pulse intro:");
		String dni = ENTRADA.nextLine();

		Cliente cliente = banco.obtenerCliente(dni);

		Cuenta cuenta = new Cuenta(codigo, tipo, comision, saldo, cliente, false);

		banco.introducirCuenta(cuenta);

		System.out.println(
				"Cuenta creada con éxito para el cliente: " + cliente.getNombre() + " " + cliente.getApellidos());

	}

	// IT WORKS
	public static void ingresarDinero() {
		// obtener dni
		System.out.println("Introduzca dni del cliente");
		String dni = ENTRADA.nextLine();

		Cliente cliente = banco.obtenerCliente(dni);

		if (cliente == null) {
			System.out.println("Cliente no encontrado");
			return;
		}

		// obtener codigo
		System.out.println("Introduzca código de la cuenta");
		Long codigo = ENTRADA.nextLong();
		ENTRADA.nextLine();

		Cuenta cuenta = banco.obtenerCuenta(codigo);

		if (cuenta == null) {
			System.out.println("Cuenta no encontrada");
			return;
		}

		// obtener dinero
		System.out.println("Dinero a ingresar:");
		Double dinero = ENTRADA.nextDouble();
		ENTRADA.nextLine();

		// llamar método ingresardinero
		Cuenta operacion = banco.ingresar(dni, codigo, dinero);

		if (operacion != null) {
			System.out.println("Ingreso realizado con éxito. Nuevo saldo: " + operacion.getSaldo());
		}
	}

	// IT WORKS
	public static void sacarDinero() {
		// obtener dni
		System.out.println("Introduzca dni del cliente");
		String dni = ENTRADA.nextLine();

		Cliente cliente = banco.obtenerCliente(dni);

		if (cliente == null) {
			System.out.println("Cliente no encontrado");
			return;
		}

		// obtener codigo
		System.out.println("Introduzca código de la cuenta");
		Long codigo = ENTRADA.nextLong();
		ENTRADA.nextLine();

		Cuenta cuenta = banco.obtenerCuenta(codigo);

		if (cuenta == null) {
			System.out.println("Cuenta no encontrada");
			return;
		}

		// obtener dinero
		System.out.println("Dinero a retirar:");
		Double dinero = ENTRADA.nextDouble();
		ENTRADA.nextLine();

		Cuenta operacion = banco.sacarDinero(dni, codigo, dinero, cuenta.getTipo());

		if (operacion != null) {
			System.out.println("Retirar dinero con éxito.: " + operacion.getSaldo());
		}
	}

	// IT WORKS
	public static void revisionMensual() {
		// obtener dni
		System.out.println("Introduzca dni del cliente");
		String dni = ENTRADA.nextLine();

		Cliente cliente = banco.obtenerCliente(dni);

		if (cliente == null) {
			System.out.println("Cliente no encontrado");
			return;
		}

		// obtener codigo
		System.out.println("Introduzca código de la cuenta");
		Long codigo = ENTRADA.nextLong();
		ENTRADA.nextLine();

		Cuenta cuenta = banco.obtenerCuenta(codigo);

		if (cuenta == null) {
			System.out.println("Cuenta no encontrada");
			return;
		}

		// llamar el método revisionMensual
		Cuenta operacion = banco.revisionMensual(dni, codigo, cuenta.getTipo());

		if (operacion != null) {
			System.out.println("Revisión mensual. Salgo: " + operacion.getSaldo());
		}
	}

	// PROBAR
	public static void estadoCuenta() {
		// obtener codigo
		System.out.println("Introduzca código de la cuenta");
		Long codigo = ENTRADA.nextLong();
		ENTRADA.nextLine();

		Cuenta cuenta = banco.obtenerCuenta(codigo);

		if (cuenta == null) {
			System.out.println("Cuenta no encontrada");
			return;
		} else {
			System.out.println(cuenta.toString());
		}
	}

}
