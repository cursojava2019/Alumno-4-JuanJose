package es.indra.ejercicio3;

public class Password {

	public static Integer LONGITUD_DEFECTO = 8;

	protected Integer longitud;
	protected String contrasenia;

	public Password() {
		this.longitud = LONGITUD_DEFECTO;
		this.contrasenia = "";
	}

	// comprobar , llamar a generarContraseña dentro del constructor
	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contrasenia = generarContrasenia();
	}

	public Integer getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return this.contrasenia;
	}

	public String generarContrasenia() {
		String contrasenia = "";
		for (int i = 0; i < this.longitud; i++) {

			switch ((int) (Math.random() * 3)) {
			case 0:
				contrasenia += (char) (Math.random() * 26 + 'A');
				break;
			case 1:
				contrasenia += (char) (Math.random() * 26 + 'a');
				break;
			case 2:
				contrasenia += (char) (Math.random() * 10 + '0');
				break;
			}
		}
		return contrasenia;
	}

	// Devuelve true si tiene +2 Mayusculas, 1+ minusculas y 5+ numeros
	public boolean esFuerte() {
		boolean fuerte;
		int mayus = 0, minus = 0, numeros = 0, ascii;

		for (int i = 0; i < this.contrasenia.length(); i++) {

			ascii = this.contrasenia.charAt(i);
			// Comprobar si es MAYUSCULA
			if (ascii >= 65 && ascii <= 90) {
				mayus++;
			}
			// Comprobar si es minuscula
			else if (ascii >= 97 && ascii <= 122) {
				minus++;
			}
			// Comprobar si es número
			else if (ascii >= 48 && ascii <= 57) {
				numeros++;
			}

		}
		// Si cumple las condiciones
		if (mayus > 2 && minus > 1 && numeros > 5) {
			fuerte = true;
		} else {
			fuerte = false;
		}

		return fuerte;
	}
}
