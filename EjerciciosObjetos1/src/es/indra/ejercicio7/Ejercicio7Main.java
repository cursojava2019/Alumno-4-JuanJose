package es.indra.ejercicio7;

public class Ejercicio7Main {

	public static void main(String[] args) {
		
		
		Raices r1 = new Raices(3, -50, 1);
		
		System.out.println(r1.getDiscriminante());
		
		System.out.println(r1.tieneRaiz());
		System.out.println(r1.tieneRaices());
		
		r1.obtenerRaices();
		
		r1.calcular();

	}

}
