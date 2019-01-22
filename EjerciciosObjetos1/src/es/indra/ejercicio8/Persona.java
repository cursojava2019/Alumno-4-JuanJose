package es.indra.ejercicio8;

public abstract class Persona {
	
	private static Character HOMBRE = 'H', MUJER = 'M';
	
	private String nombre;
	private Integer edad;
	private Character sexo;
	
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = HOMBRE;
	}

	public Persona(String nombre, Integer edad, Character sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public Character comprobarSexo(char sexo) {
		if(sexo == HOMBRE || sexo == MUJER) {
			return sexo;
		}else {
			return HOMBRE;
		}
	}
	
	//Devuelve true si asiste y false si no lo hace
	public abstract Boolean asistir();

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	
	
	
}
