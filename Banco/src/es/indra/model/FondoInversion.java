package es.indra.model;

public class FondoInversion extends Cuenta {

	public static Float INTERES = (float) 0.34;

	public FondoInversion() {
		// TODO Auto-generated constructor stub
	}

	public FondoInversion(String tipo, Float comision, Double saldo) {
		super(tipo, comision, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double revisionMensual() {
		// TODO Auto-generated method stub
		Double saldo = this.getSaldo() + FondoInversion.INTERES + this.getComision();
		return saldo;
	}

	@Override
	// Se puede sacar hasta 500 € de más del saldo, por eso creo la variable
	// 'limite'
	public Double sacarDinero(Double dinero) {
		Double limite = this.getSaldo() + 500;
		if (limite >= dinero) {
			return super.sacarDinero(dinero);
		} else {
			return null;
		}

	}

}
