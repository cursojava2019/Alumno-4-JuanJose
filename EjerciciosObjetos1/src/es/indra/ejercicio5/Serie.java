package es.indra.ejercicio5;

public class Serie implements Entregable {

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
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getNumTemporadas() {
		return this.numTemporadas;
	}

	public void setNumTemporadas(Integer numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return this.creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + this.titulo + ", numTemporadas=" + this.numTemporadas + ", entregado="
				+ this.entregado + ", genero=" + this.genero + ", creador=" + this.creador + "]";
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;

	}

	@Override
	public Boolean isEntregado() {
		return this.entregado;
	}

	@Override
	public Integer compararObject(Object o) {
		int num = 2;
		if (o instanceof Serie) {
			Serie aux = (Serie) o;
			Integer numTemp = aux.getNumTemporadas();
			if (this.numTemporadas == numTemp) {
				num = 0;
			} else if (this.numTemporadas < numTemp) {
				num = 1;
			} else {
				num = -1;
			}

		} else {
			System.out.println("No es una serie");
		}
		return num;
	}

}
