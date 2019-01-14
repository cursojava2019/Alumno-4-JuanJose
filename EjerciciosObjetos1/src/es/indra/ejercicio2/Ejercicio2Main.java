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

	public static void main(String[] args) {

		inicializar();

		Persona persona1 = new Persona();
		System.out.println("Nombre:");
		persona1.nombre = TECLADO.nextLine();
		System.out.println("Edad:");
		persona1.edad = TECLADO.nextInt();
		System.out.println("Sexo:");
		persona1.sexo = TECLADO.next().charAt(0);
		System.out.println("Peso:");
		persona1.peso = TECLADO.nextFloat();
		System.out.println("Altura:");
		persona1.altura = TECLADO.nextFloat();

		Persona persona2 = new Persona("Juan", 26, 'H');

		Persona persona3 = new Persona();
		persona3.setNombre(TECLADO.nextLine());
		persona3.setEdad(TECLADO.nextInt());
		persona3.setSexo(TECLADO.next().charAt(0));
		persona3.setAltura(TECLADO.nextFloat());
		persona3.setPeso(TECLADO.nextFloat());

		System.out.println("Peso Persona 1: " + calcularPeso(persona1));
		System.out.println("Peso Persona 2: " + calcularPeso(persona2));
		System.out.println("Peso Persona 3: " + calcularPeso(persona3));

		System.out.println("Es mayor de edad la persona1: " + persona1.esMayorDeEdad());
		System.out.println("Es mayor de edad la persona2: " + persona2.esMayorDeEdad());
		System.out.println("Es mayor de edad la persona3: " + persona3.esMayorDeEdad());

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}

}
