package es.indra.ejercicio8;

import java.util.ArrayList;

public class Aula {

	private Integer idAula;
	private Integer maxStudents;
	private String asignatura;
	
	private Profesor profesor;
	private ArrayList<Estudiante> estudiantes;
	
	
	public Aula() {
		this.idAula = 0;
		this.maxStudents = 0;
		this.asignatura = "";
		this.profesor = new Profesor();
		this.estudiantes = new ArrayList<Estudiante>();
	}


	public Aula(Integer idAula, Integer maxStudents, String asignatura, Profesor profesor,
			ArrayList<Estudiante> estudiantes) {
		super();
		this.idAula = idAula;
		this.maxStudents = maxStudents;
		this.asignatura = asignatura;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}


	public Integer getIdAula() {
		return idAula;
	}


	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}


	public Integer getMaxStudents() {
		return maxStudents;
	}


	public void setMaxStudents(Integer maxStudents) {
		this.maxStudents = maxStudents;
	}


	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public Boolean darClase(Profesor profesor, ArrayList<Estudiante> estudiantes) {
		 //profesor disponible y materia adecuada
		if(profesor.asistir() && profesor.getMateria().equalsIgnoreCase(this.asignatura)) {
			//alumnos disponibles
			Integer siAsiste=0, noAsiste=0;
			for (Estudiante estudiante : estudiantes) {
				if(estudiante.asistir()) {
					siAsiste ++;
				}else {
					noAsiste++;
				}
			}
			
			if(siAsiste > noAsiste) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	
	
	
	

}
