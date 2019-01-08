/**
 * 
 */
package es.indra.ejercicio1;

import java.util.Scanner;

/**
 * @author cursojava
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = teclado.nextInt();
		
		
		if(numero % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		
		
	}

}
