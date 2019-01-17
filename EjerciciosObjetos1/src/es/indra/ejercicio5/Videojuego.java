package es.indra.ejercicio5;

public class Videojuego implements Entregable {

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
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getHorasEstimadas() {
		return this.horasEstimadas;
	}

	public void setHorasEstimadas(Integer horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return this.compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + this.titulo + ", horasEstimadas=" + this.horasEstimadas + ", entregado="
				+ this.entregado + ", genero=" + this.genero + ", compania=" + this.compania + "]";
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
		if (o instanceof Videojuego) {
			Videojuego aux = (Videojuego) o;
			Integer numHoras = aux.getHorasEstimadas();
			if (this.horasEstimadas == numHoras) {
				num = 0;
			} else if (this.horasEstimadas < numHoras) {
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
