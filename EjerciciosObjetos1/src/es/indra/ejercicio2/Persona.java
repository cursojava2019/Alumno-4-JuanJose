package es.indra.ejercicio2;

public class Persona {
	protected String nombre;
	protected Integer edad;
	protected String dni;
	protected char sexo;
	protected Float peso;
	protected Float altura;

	// Constructores
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = 'H';
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, Integer edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = "";
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, Integer edad, String dni, char sexo, Float peso, Float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public double calcularIMC() {
		double imc;
		imc = this.peso / (Math.pow(this.altura, 2));
		return imc;
	}

	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	protected void comprobarSexo() {

	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + ", dni=" + this.dni + ", sexo=" + this.sexo
				+ ", peso=" + this.peso + ", altura=" + this.altura + "]";
	}

	// genera dni con números aleatorios sin letra o buscarlo completo
	protected void generaDni() {

	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Float getPeso() {
		return this.peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getAltura() {
		return this.altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

}
