package es.indra.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce primer número");
		int num1 = tec.nextInt();
		System.out.println("Introduce segundo número");
		int num2 = tec.nextInt();
		
		if(num1 > num2) {
			for(int i = num2; i<num1; i++) {
				System.out.println(i);
			}
		}else {
			for(int i = num1; i<num2; i++) {
				System.out.println(i);
			}
		}
		
	}

}
