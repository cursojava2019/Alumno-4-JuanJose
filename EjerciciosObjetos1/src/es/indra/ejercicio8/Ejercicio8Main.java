package es.indra.ejercicio8;

import java.util.ArrayList;

public class Ejercicio8Main {
	
	private Aula aula = new Aula();

	public static void main(String[] args) {
		
		//Crear profesor
		Profesor profesor = new Profesor("Don Franciscso", 50, 'M', "matemáticas");
		
		//Crear array de alumnos
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Estudiante e1 = new Estudiante("juan", 17, 'H', 6);
		Estudiante e2 = new Estudiante("maria", 14, 'M', 8);
		Estudiante e3 = new Estudiante("pedro", 18, 'H', 9);
		Estudiante e4 = new Estudiante("felipe", 19, 'H', 2);
		Estudiante e5 = new Estudiante("rocio", 17, 'M', 3);
		Estudiante e6 = new Estudiante("julian", 12, 'H', 5);
		Estudiante e7 = new Estudiante("celeste", 13, 'M', 10);
		Estudiante e8 = new Estudiante("estefany", 15, 'M', 1);
		Estudiante e9 = new Estudiante("isabel", 20, 'M', 4);
		Estudiante e10 = new Estudiante("roberto", 11, 'H', 7);
		
		estudiantes.add(e1);
		estudiantes.add(e2);
		estudiantes.add(e3);
		estudiantes.add(e4);
		estudiantes.add(e5);
		estudiantes.add(e6);
		estudiantes.add(e7);
		estudiantes.add(e8);
		estudiantes.add(e9);
		estudiantes.add(e10);
		
		//Crear objeto Aula
		Aula aula = new Aula(1, 20, "matemáticas", profesor, estudiantes);
		
		if(aula.darClase(profesor, estudiantes)) {
			
			System.out.println("Si se puede dar clase");
			//Número de alumnos y alumnas aprobados
			Integer numHA = 0, numMA = 0;
			
			for (Estudiante estudiante : estudiantes) {
				
				if(estudiante.aprobado()) {
					if(estudiante.getSexo() == 'H') {
						numHA++;
					}else if(estudiante.getSexo() == 'M' ){
						numMA++;
					}
				}
				
			}
			
			System.out.println("Número de alumnos aprobados: "+numHA);
			System.out.println("Número de alumnas aprobadas: "+numMA);
			
		}else {
			System.out.println("No se puede dar clase.");
		}
		

	}

}
