package es.indra.model;

public class Cuenta {

	//public static String CUENTA_CORRIENTE = "CC", CUENTA_VIVIENDA = "CV", FONDO_INVERSION = "FI";
	public static Float COMISION_DEFECTO = (float) 0.6;

	private String tipo;
	private Float comision;
	private Double saldo;
	
	public Cuenta() {
		super();
	}

	public Cuenta(String tipo, Float comision, Double saldo) {
		super();
		this.tipo = tipo;
		this.comision = comision;
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getComision() {
		return comision;
	}

	public void setComision(Float comision) {
		this.comision = comision;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [tipo=" + tipo + ", comision=" + comision + ", saldo=" + saldo + "]";
	}
	
	
	
}
