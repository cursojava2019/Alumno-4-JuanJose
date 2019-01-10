package es.indra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2Main {

	private static Scanner TECLADO;
	private static Persona persona;

	public void inicializar(){

		TECLADO = new Scanner(System.in);

		System.out.println("Nombre:");
		persona.nombre = TECLADO.nextLine();
		System.out.println("Edad:");
		persona.edad = TECLADO.nextInt();
		System.out.println("Sexo:");
		persona.sexo = TECLADO.nextChartAt();
		System.out.println("Pesp:");
		persona.peso = TECLADO.nextFloat();
		System.out.println("Altura:");
		persona.sexo = TECLADO.nextFloat();
		
	}

	public static void main(String[] args) {



	}

}
