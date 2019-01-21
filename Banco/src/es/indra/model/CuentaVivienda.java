package es.indra.model;

public class CuentaVivienda extends Cuenta {

	public static Float INTERES = (float) 0.1;

	public CuentaVivienda() {
	}

	public CuentaVivienda(String tipo, Float comision, Double saldo, Cliente cliente, Boolean bloqueada) {
		super(tipo, comision, saldo, cliente, bloqueada);
	}

	public static Float getINTERES() {
		return INTERES;
	}

	@Override
	public Double revisionMensual() {
		// TODO Auto-generated method stub
		Double saldo = this.getSaldo() + CuentaVivienda.INTERES;
		return saldo;
	}

	// De esta cuenta, no se puede sacar dinero
	@Override
	public Double sacarDinero(Double dinero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "CuentaVivienda []";
	}

}
