package es.indra.model;

public class CuentaCorriente extends Cuenta {

	public static Float INTERES = (float) 0.1;

	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
	}

	public CuentaCorriente(String tipo, Float comision, Double saldo) {
		super(tipo, comision, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double revisionMensual() {

		Double saldo = this.getSaldo() + CuentaCorriente.INTERES - this.getComision();
		return saldo;
	}

	@Override
	// Si el dinero a sacar es mayor que el saldo, no se efectuará la operación
	public Double sacarDinero(Double dinero) {
		if (this.getSaldo() >= dinero) {
			return super.sacarDinero(dinero);
		} else {
			return null;
		}
	}

}
