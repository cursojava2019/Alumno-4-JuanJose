package es.indra.controller;

import java.io.Serializable;
import java.util.TreeMap;

import es.indra.model.Cliente;
import es.indra.model.Cuenta;

public class Banco implements Serializable {

	private TreeMap<String, Cliente> clientes;
	private TreeMap<Long, Cuenta> cuentas;

	public Banco() {
		this.clientes = new TreeMap<String, Cliente>();
		this.cuentas = new TreeMap<Long, Cuenta>();
	}

	public TreeMap<String, Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(TreeMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}

	public TreeMap<Long, Cuenta> getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(TreeMap<Long, Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	/* -------------------------------------- */

	public Cliente obtenerCliente(String dni) {
		return this.clientes.get(dni);
	}

	public Cuenta obtenerCuenta(Long codigo) {
		return this.cuentas.get(codigo);
	}

	public Boolean introducirCliente(Cliente c) {
		this.clientes.put(c.getDni(), c);
		return true;
	}

	public Boolean introducirCuenta(Cuenta c) {
		this.cuentas.put(c.getCodigo(), c);
		return true;
	}

	public Cuenta ingresar(String dni, Long codigo, Double dinero) {

		Double s;
		Cliente cliente = this.clientes.get(dni);
		Cuenta cuentas = this.cuentas.get(codigo);
		if (cliente != null && cuentas != null && cuentas.getCliente().equals(cliente)) {
			s = cuentas.ingresarDinero(dinero);
			cuentas.setSaldo(s);
			return cuentas;
		} else {
			return null;
		}
	}

	public Cuenta sacarDinero(String dni, Long codigo, Double dinero, String tipoCuenta) {
		Double s = (double) 0.0;
		Cliente cliente = this.clientes.get(dni);
		Cuenta cuentas = this.cuentas.get(codigo);
		if (cliente != null && cuentas != null && cuentas.getCliente().equals(cliente)) {

			// controlar tipos de cuentas con sus restricciones
			if (tipoCuenta.equalsIgnoreCase("Cuenta corriente")) {
				if (cuentas.getSaldo() >= dinero) {
					s = cuentas.sacarDinero(dinero);
				}
			} else if (tipoCuenta.equalsIgnoreCase("Cuenta vivienda")) {
				System.out.println("No se puede sacar dinero de la Cuenta Vivienda");
			} else if (tipoCuenta.equalsIgnoreCase("Fondo inversion")) {
				Double limite = cuentas.getSaldo() + 500;
				if (limite >= dinero) {
					s = cuentas.sacarDinero(dinero);
				} else {
					cuentas.setBloqueada(true);
				}
			}
			cuentas.setSaldo(s);
			return cuentas;
		} else {
			return null;
		}
	}

	public Cuenta revisionMensual(String dni, Long codigo, String tipoCuenta) {
		Cliente cliente = this.clientes.get(dni);
		Cuenta cuenta = this.cuentas.get(codigo);
		if (cliente != null && cuenta != null && cuenta.getCliente().equals(cliente)) {

			// si el tipo de cuenta es CuentaCorriente, no hay comisión
			if (tipoCuenta.equalsIgnoreCase("cuenta vivienda")) {
				cuenta.setComision((float) 0.0);
			}
			cuenta.revisionMensual();
			return cuenta;
		} else {
			return null;
		}
	}
}
