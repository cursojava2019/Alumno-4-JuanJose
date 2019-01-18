package es.indra.ejercicio5;

import java.util.ArrayList;

public class Ejercicio5Main {

	public static void main(String[] args) {

		// Crear 2 array para las dos clases
		ArrayList<Serie> series = new ArrayList<Serie>(5);
		ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>(5);

		// Creo los objetos
		Serie s1 = new Serie();
		Serie s2 = new Serie("La red social", "juan");
		Serie s3 = new Serie("Terminator", "jorge");
		Serie s4 = new Serie("Shameless", 10, "drama", "pepe");
		Serie s5 = new Serie("Breaking bad", 6, "comedia", "felipe");

		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("fifa18", 200);
		Videojuego v3 = new Videojuego("2k16", 100);
		Videojuego v4 = new Videojuego("Gta", 1234, "mundo abierto", "rockstar");
		Videojuego v5 = new Videojuego("fornite", 560, "shooting", "ni idea");

		// Añadir objetos dentro de las posiciones del array
		series.add(s1);
		series.add(s2);
		series.add(s3);
		series.add(s4);
		series.add(s5);

		videojuegos.add(v1);
		videojuegos.add(v2);
		videojuegos.add(v3);
		videojuegos.add(v4);
		videojuegos.add(v5);

		s2.entregar();
		s4.devolver();

		v1.entregar();
		v2.devolver();
		v3.entregar();

		Integer seriesEntregadas = 0, juegosEntregados = 0;
		// Contar series entregadas
		System.out.println("Lista de series.");
		for (Serie serie : series) {

			if (serie.isEntregado() == true) {
				seriesEntregadas++;
			}

			System.out.println(serie.toString());

		}
		System.out.println("Nº de series entregadas: " + seriesEntregadas);

		System.out.println("Lista de videojuegos.");
		for (Videojuego videojuego : videojuegos) {

			if (videojuego.isEntregado()) {
				juegosEntregados++;
			}
			System.out.println(videojuego.toString());
		}

		System.out.println("Nº de juegos entregados: " + juegosEntregados);

	}

}
