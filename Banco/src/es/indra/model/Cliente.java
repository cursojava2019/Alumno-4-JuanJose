package es.indra.model;

import java.util.ArrayList;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, String apellidos, String direccion, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + this.dni + ", nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", direccion="
				+ this.direccion + ", telefono=" + this.telefono + "]";
	}

}
