package es.indra.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char letraDia ;
		boolean laborable = true;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Día de la semana:");
		String dia = tec.nextLine();
		
		letraDia = dia.charAt(0);
		
		switch (letraDia) {
			case 'l':
				laborable = true;
				break;
			case 'm':
				laborable = true;
				break;
			case 'x':
				laborable = true;
				break;
			case 'j':
				laborable = true;
				break;
			case 'v':
				laborable = true;
				break;
			case 's':
				laborable = false;
				break;
			case 'd':
				laborable = false;
				break;
			default:
				break;
		}
		
		if(laborable) {
			System.out.println("Es laborable");
		}else {
			System.out.println("NO es laborable");
		}
		
		//Cuando meto algo distingo a un dia de la semana ERROR
	}

}
