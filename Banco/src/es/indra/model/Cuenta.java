package es.indra.model;

public abstract class Cuenta {

	public static Float COMISION_DEFECTO = (float) 0.6;

	private Long codigo;
	private String tipo;
	private Float comision;
	private Double saldo;
	private Cliente cliente;
	private Boolean bloqueada;

	public Cuenta() {
		super();
		this.comision = COMISION_DEFECTO;
		this.cliente = new Cliente();
		this.bloqueada = false;
	}

	public Cuenta(String tipo, Float comision, Double saldo, Cliente cliente, Boolean bloqueada) {
		super();
		this.tipo = tipo;
		this.comision = comision;
		this.saldo = saldo;
		this.cliente = cliente;
		this.bloqueada = bloqueada;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getComision() {
		return this.comision;
	}

	public void setComision(Float comision) {
		this.comision = comision;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Boolean getBloqueada() {
		return this.bloqueada;
	}

	public void setBloqueada(Boolean bloqueada) {
		this.bloqueada = bloqueada;
	}

	@Override
	public String toString() {
		return "Cuenta [tipo=" + this.tipo + ", comision=" + this.comision + ", saldo=" + this.saldo + "]";
	}

	public Double ingresarDinero(Double dinero) {
		this.saldo = this.saldo + dinero;
		return this.saldo;
	}

	public Double sacarDinero(Double dinero) {
		this.saldo = this.saldo - dinero;
		return this.saldo;
	}

	public void cambiarCliente() {

	}

	// crear pero no hacer nada, implementar en cada cuenta con su interes
	// correspondiente
	public abstract Double revisionMensual();

}
