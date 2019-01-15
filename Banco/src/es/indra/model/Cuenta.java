package es.indra.model;

public class Cuenta {

	public static String CUENTA_CORRIENTE = "CC", CUENTA_VIVIENDA = "CV", FONDO_INVERSION = "FI";
	public static Float COMISION_DEFECTO = (float) 0.6;

	private String tipo;
	private Float comision;
}
