package es.indra.ejercicio3;

import java.util.Scanner;

public class Ejercicio3Main {

	private static Scanner TECLADO;

	public static void inicializar() {
		TECLADO = new Scanner(System.in);
	}

	// no se puede implementar
	public static void contraseniaFuerte(Password p) {
		if (p.esFuerte()) {
			System.out.println("Contrase�a segura");
		} else {
			System.out.println("Contrase�a NO segura");
		}
	}

	public static void main(String[] args) {
		inicializar();
		System.out.println("Introducir n�mero de contrase�as a generar:");
		Integer numContrasenias = TECLADO.nextInt();
		// Crea el array de passwords
		Password arrayPasswords[] = new Password[numContrasenias];
		System.out.println("Introducir longitud de las contrase�as a generar:");
		Integer longitudContrasenias = TECLADO.nextInt();

		// Crear array de booleanos para indicar si cada contrase�a es fuerte
		Boolean arrayFuertes[] = new Boolean[numContrasenias];
		// Crear y meter un objeto nuevo de la clase Password en cada posici�n del Array
		for (int i = 0; i < arrayPasswords.length; i++) {
			arrayPasswords[i] = new Password(longitudContrasenias);
			arrayFuertes[i] = arrayPasswords[i].esFuerte();

			// Mostrar la contrase�a y si es o no fuerte
			System.out.println(arrayPasswords[i].getContrasenia() + " : " + arrayFuertes[i]);
		}
	}

}
