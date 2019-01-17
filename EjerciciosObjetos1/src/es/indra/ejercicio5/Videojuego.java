package es.indra.ejercicio5;

public class Videojuego {

	public static final Integer HORAS_ESTIMADAS_DEFECTO = 10;
	public static final Boolean ENTREGADO_DEFECTO = false;
	
	private String titulo;
	private Integer horasEstimadas;
	private Boolean entregado;
	private String genero;
	private String compania;
	
	public Videojuego() {
		super();
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, Integer horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, Integer horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
		this.entregado = ENTREGADO_DEFECTO;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(Integer horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}
	
	
	
	
	
	
	
	

}
