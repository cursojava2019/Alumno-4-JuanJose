package es.indra.academia.model.entities;

public class Usuario {

	Long id;
	String usuario;
	String clave;
	Boolean habilitado;
	String permisos;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Boolean getHabilitado() {
		return this.habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public String getPermisos() {
		return this.permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + this.id + ", usuario=" + this.usuario + ", clave=" + this.clave + ", habilitado="
				+ this.habilitado + "]";
	}

}