package es.indra.model;

public class CuentaVivienda extends Cuenta {

	public static Float INTERES = (float) 0.1;

	public CuentaVivienda() {
		// TODO Auto-generated constructor stub
	}

	public CuentaVivienda(String tipo, Float comision, Double saldo) {
		super(tipo, comision, saldo);
		// TODO Auto-generated constructor stub
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

}
