package es.indra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2Main {

	private static Scanner TECLADO;

	public static void inicializar() {

		TECLADO = new Scanner(System.in);

	}

	public static String calcularPeso(Persona p) {
		String result = "";
		int imc = p.calcularIMC();

		switch (imc) {
		case 1:
			result = "tiene sobrepeso";
			break;
		case 0:
			result = "tiene un peso por debajo de su peso ideal";
			break;
		case -1:
			result = "está en su peso ideal";
			break;
		}
		return result;

	}

	public static String mayorEdad(Persona p) {
		String result = "";

		boolean mayor = p.esMayorDeEdad();

		if (mayor) {
			result = "es mayor de edad";
		} else {
			result = "es menor de edad";
		}
		return result;
	}

	public static void main(String[] args) {

		inicializar();
		System.out.println("Introducir datos de la persona:");
		Persona persona1 = new Persona();
		System.out.println("Introduzca nombre y pulse intro:");
		persona1.nombre = TECLADO.nextLine();
		System.out.println("Introduzca edad y pulse intro:");
		persona1.edad = TECLADO.nextInt();
		System.out.println("Introduzca sexo y pulse intro:");
		persona1.sexo = TECLADO.next().charAt(0);
		System.out.println("Introduzca peso y pulse intro:");
		persona1.peso = TECLADO.nextFloat();
		TECLADO.nextLine();
		System.out.println("Introduzca altura y pulse intro:");
		persona1.altura = TECLADO.nextFloat();
		TECLADO.nextLine();

		Persona persona2 = new Persona("Juan", 26, 'H');

		Persona persona3 = new Persona();
		System.out.println("Introducir datos de la persona:");
		System.out.println("Introduzca nombre y pulse intro:");
		persona3.setNombre(TECLADO.nextLine());
		System.out.println("Introduzca edad y pulse intro:");
		persona3.setEdad(TECLADO.nextInt());
		System.out.println("Introduzca sexo y pulse intro:");
		persona3.setSexo(TECLADO.next().charAt(0));
		System.out.println("Introduzca peso y pulse intro:");
		persona3.setAltura(TECLADO.nextFloat());
		System.out.println("Introduzca altura y pulse intro:");
		persona3.setPeso(TECLADO.nextFloat());

		System.out.println("Peso Persona 1: " + calcularPeso(persona1));
		System.out.println("Peso Persona 2: " + calcularPeso(persona2));
		System.out.println("Peso Persona 3: " + calcularPeso(persona3));

		System.out.println("Es mayor de edad la persona1: " + mayorEdad(persona1));
		System.out.println("Es mayor de edad la persona2: " + mayorEdad(persona2));
		System.out.println("Es mayor de edad la persona3: " + mayorEdad(persona3));

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}

}
