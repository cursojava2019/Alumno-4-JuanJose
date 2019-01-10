package es.indra.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {
		Television t1 = new Television((float) 300, (float) 10);
		Television t2 = new Television((float) 200, (float) 20);
		Television t3 = new Television((float) 100.5, (float) 30.45);
		Television t4 = new Television((float) 600, "NEGRO", 'A', (float) 4, 50, true);
		Television t5 = new Television((float) 34.5, "ROJO", 'C', (float) 4.5, 50, false);

		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora((float) 34.3, (float) 2.2);
		Lavadora l3 = new Lavadora((float) 23, "AZUL", 'D', (float) 12.8, (float) 5.5);

		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico((float) 100, (float) 20);

		ArrayList<Electrodomestico> listaBuena = new ArrayList<Electrodomestico>();

		listaBuena.add(t1);
		listaBuena.add(t2);
		listaBuena.add(t3);
		listaBuena.add(t4);
		listaBuena.add(t5);
		listaBuena.add(l1);
		listaBuena.add(l2);
		listaBuena.add(l3);
		listaBuena.add(e1);
		listaBuena.add(e2);

		Float totalTV = (float) 0;
		Float totalLavadoras = (float) 0;
		Float totalElectrodomesticos = (float) 0;

		for (Electrodomestico electrodomestico : listaBuena) {

			if (electrodomestico instanceof Television) {
				totalTV += electrodomestico.precioFinal();
			}
			if (electrodomestico instanceof Lavadora) {
				totalLavadoras += electrodomestico.precioFinal();
			}
			System.out.println(electrodomestico.getClass().getName() + " : " + electrodomestico.precioFinal());
			totalElectrodomesticos += electrodomestico.precioFinal();
		}

		System.out.println("Precio total Tv: " + totalTV);
		System.out.println("Precio total Lavadoras: " + totalLavadoras);
		System.out.println("Precio total todo: " + totalElectrodomesticos);
	}

}
