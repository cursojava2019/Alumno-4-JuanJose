package es.indra.ejercicio2;

public class Persona {
	protected static Character HOMBRE = 'H', MUJER = 'M';

	protected String nombre, dni;
	protected Integer edad;
	protected Character sexo;
	protected Float peso, altura;

	// Constructores
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = HOMBRE;
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, Integer edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.dni = "";
		this.peso = Float.valueOf(0);
		this.altura = Float.valueOf(0);
	}

	public Persona(String nombre, Integer edad, String dni, char sexo, Float peso, Float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDni();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	// usar constantes
	public int calcularIMC() {
		int imc;
		double resultadoImc;
		resultadoImc = this.peso / (Math.pow(this.altura, 2));
		if (resultadoImc < 20) {
			imc = -1;
		} else if (resultadoImc >= 20 && resultadoImc <= 25) {
			imc = 0;
		} else {
			imc = 1;
		}
		return imc;
	}

	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	protected char comprobarSexo(char sexo) {
		char letra;
		if (this.sexo == HOMBRE || this.sexo == MUJER) {
			letra = sexo;
		} else {
			letra = HOMBRE;
		}
		return letra;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", edad=" + this.edad + ", dni=" + this.dni + ", sexo=" + this.sexo
				+ ", peso=" + this.peso + ", altura=" + this.altura + "]";
	}

	// genera dni con números aleatorios sin letra o buscarlo completo
	protected String generaDni() {
		String dni = "", letraDni = "", letras = "ABCDEHIJKFLQMNSOPRVWXYZ";
		char letra;
		int numero = 0;
		for (int i = 0; i < 8; i++) {
			numero = (int) (Math.random() * 8) + 1;
			dni += Integer.toString(numero);
		}

		letra = letras.charAt((int) (Math.random() * 23) + 1);
		letraDni = Character.toString(letra);
		dni += letraDni;
		return dni;
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
		this.sexo = comprobarSexo(sexo);
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
