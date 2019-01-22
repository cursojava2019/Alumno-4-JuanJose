package es.indra.ejercicio8;

public class Estudiante extends Persona {

	private Integer calificacion;
	
	public Estudiante() {
		this.calificacion = 0;
	}

	public Estudiante(String nombre, Integer edad, Character sexo, Integer cal) {
		super(nombre, edad, sexo);
		this.calificacion = comprobarCalificacion(cal);
	}
	
	

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = comprobarCalificacion(calificacion);
	}

	public Integer comprobarCalificacion(Integer nota) {
		if(nota >= 0 || nota <= 10) {
			return nota;
		}else {
			return 0;
		}
	}
	
	//Devuelve true un 50% de las veces y false las restantes
	@Override
	public Boolean asistir() {
		Double numAleatorio = Math.random();
		if(numAleatorio >= 0.5 ) {
			return true;
		}else {
			return false;
		}	
	}
	
	public Boolean aprobado() {
		
		if(this.calificacion >= 5) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Estudiante [calificacion=" + calificacion + "]";
	}
	
	
	
	
	
	

}
