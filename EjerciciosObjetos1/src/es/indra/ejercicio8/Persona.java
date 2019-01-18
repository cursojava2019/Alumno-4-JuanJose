package es.indra.ejercicio8;

public class Persona {
	
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
	
	
	
	
	
	
	public Character comprobarSexo(char sexo) {
		if(sexo == HOMBRE || sexo == MUJER) {
			return sexo;
		}else {
			return HOMBRE;
		}
	}
	
	
}
