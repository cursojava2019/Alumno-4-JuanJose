package es.indra.model.entities;

import java.io.Serializable;

public class Cuenta implements Serializable {

	public static Float COMISION_DEFECTO = (float) 0.6;
	public static String CUENTA_CORRIENTE = "Cuenta corriente", CUENTA_VIVIENDA = "Cuenta vivienda",
			FONDO_INVERSION = "Fondo inversion";

	private Long codigo;
	private String tipo;
	private Float comision;
	private Double saldo;
	private Cliente cliente;
	private Boolean bloqueada;

	public Cuenta() {
		super();
		this.codigo = (long) 0;
		this.comision = COMISION_DEFECTO;
		this.cliente = new Cliente();
		this.tipo = CUENTA_CORRIENTE;
		this.bloqueada = false;
	}

	public Cuenta(Long codigo, String tipo, Float comision, Double saldo, Cliente cliente, Boolean bloqueada) {
		super();
		this.codigo = codigo;
		this.tipo = comprobarTipo(tipo);
		this.comision = comision;
		this.saldo = saldo;
		this.cliente = cliente;
		this.bloqueada = bloqueada;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = comprobarTipo(tipo);
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

	// Este es el método cambiar cliente
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	public String comprobarTipo(String tipo) {
		if (tipo.equalsIgnoreCase(CUENTA_CORRIENTE) || tipo.equalsIgnoreCase(CUENTA_VIVIENDA)
				|| tipo.equalsIgnoreCase(FONDO_INVERSION)) {
			return tipo;
		} else {
			return CUENTA_CORRIENTE;
		}
	}

	public Double ingresarDinero(Double dinero) {
		this.saldo = this.saldo + dinero;
		return this.saldo;
	}

	public Double sacarDinero(Double dinero) {
		this.saldo = this.saldo - dinero;
		return this.saldo;
	}

	public Double revisionMensual() {

		Float interes = (float) 0.0;
		if (this.tipo.equalsIgnoreCase(CUENTA_CORRIENTE)) {
			interes = (float) 0.1;
		} else if (this.tipo.equalsIgnoreCase(CUENTA_VIVIENDA)) {
			interes = (float) 0.2;
		} else if (this.tipo.equalsIgnoreCase(FONDO_INVERSION)) {
			interes = (float) 0.34;
		}

		Double saldo = this.getSaldo() * interes - this.getComision();
		this.saldo = saldo;
		return saldo;
	}

}
