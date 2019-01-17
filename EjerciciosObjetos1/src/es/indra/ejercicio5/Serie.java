package es.indra.ejercicio5;

public class Serie {
	
	public static final Integer NUM_TEMPORADAS_DEFECTO = 3;
	public static final Boolean ENTREGADO_DEFECTO = false;
	
	private String titulo;
	private Integer numTemporadas;
	private Boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUM_TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = NUM_TEMPORADAS_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
	}

	public Serie(String titulo, Integer numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = ENTREGADO_DEFECTO;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(Integer numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	
	
	
	
	

}
