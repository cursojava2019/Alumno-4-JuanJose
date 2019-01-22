package es.indra.ejercicio8;

public class Profesor extends Persona {

	private static final String MATEMATICAS = "matemáticas", FILOSOFIA = "filosofía", FISICA = "física";
	
	private String materia;
	
	public Profesor() {
		this.materia = "";
	}

	public Profesor(String nombre, Integer edad, Character sexo, String materia) {
		super(nombre, edad, sexo);
		this.materia = comprobarMateria(materia);
	}
	
	

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = comprobarMateria(materia);
	}

	//Comprueba que la materia es una de las disponibles
	public String comprobarMateria(String asignatura) {
		if(asignatura == MATEMATICAS || asignatura == FILOSOFIA || asignatura == FISICA) {
			return asignatura;
		}else {
			return MATEMATICAS;
		}
	}
	
	@Override
	public Boolean asistir() {
		Double numAleatorio = Math.random();
		if(numAleatorio<0.8) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + "]";
	}
	
	
	
	

}
