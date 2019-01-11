package es.indra.ejercicio3;

public class Password {
	protected Integer longitud;
	protected String contrasenia;

	public Password() {
		this.longitud = 8;
		this.contrasenia = "";
	}

	// comprobar
	public Password(int longitud) {
		this.longitud = (int) (Math.random() * longitud) + 1;
	}

	public boolean esFuerte() {
		boolean fuerte = true;

		return fuerte;
	}

	public void generarContrasenia() {

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

}
