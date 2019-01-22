package es.indra.controller;

import java.io.Serializable;
import java.util.TreeMap;

import es.indra.model.Cliente;
import es.indra.model.Cuenta;
import es.indra.model.CuentaCorriente;
import es.indra.model.CuentaVivienda;
import es.indra.model.FondoInversion;

public class Banco implements Serializable {

	private TreeMap<String, Cliente> clientes;
	private TreeMap<Long, Cuenta> cuentas;
	private TreeMap<Long, CuentaCorriente> cuentasCorrientes;
	private TreeMap<Long, CuentaVivienda> cuentasVivienda;
	private TreeMap<Long, FondoInversion> fondosInversion;

	public Banco() {
		this.clientes = new TreeMap<String, Cliente>();
		this.cuentas = new TreeMap<Long, Cuenta>();
		this.cuentasCorrientes = new TreeMap<Long, CuentaCorriente>();
		this.cuentasVivienda = new TreeMap<Long, CuentaVivienda>();
		this.fondosInversion = new TreeMap<Long, FondoInversion>();
	}

	public TreeMap<String, Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(TreeMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}

	public TreeMap<Long, CuentaCorriente> getCuentasCorrientes() {
		return this.cuentasCorrientes;
	}

	public void setCuentasCorrientes(TreeMap<Long, CuentaCorriente> cuentasCorrientes) {
		this.cuentasCorrientes = cuentasCorrientes;
	}

	public TreeMap<Long, CuentaVivienda> getCuentasVivienda() {
		return this.cuentasVivienda;
	}

	public void setCuentasVivienda(TreeMap<Long, CuentaVivienda> cuentasVivienda) {
		this.cuentasVivienda = cuentasVivienda;
	}

	public TreeMap<Long, FondoInversion> getFondosInversion() {
		return this.fondosInversion;
	}

	public void setFondosInversion(TreeMap<Long, FondoInversion> fondosInversion) {
		this.fondosInversion = fondosInversion;
	}

	public Cliente obtenerCliente(String dni) {
		return this.clientes.get(dni);
	}

	public CuentaCorriente obtenerCuentaC(Long codigo) {
		return this.cuentasCorrientes.get(codigo);
	}

	public CuentaVivienda obtenerCuentaV(Long codigo) {
		return this.cuentasVivienda.get(codigo);
	}

	public FondoInversion obtenerFondosInversion(Long codigo) {
		return this.fondosInversion.get(codigo);
	}

	public Boolean introducirCliente(Cliente c) {
		this.clientes.put(c.getDni(), c);
		return true;
	}

	public Boolean crearCuentaC(CuentaCorriente c) {
		this.cuentasCorrientes.put(c.getCodigo(), c);
		return true;
	}

	public Boolean crearCuentaV(CuentaVivienda c) {
		this.cuentasVivienda.put(c.getCodigo(), c);
		return true;
	}

	public Boolean crearFondoInversion(FondoInversion c) {
		this.fondosInversion.put(c.getCodigo(), c);
		return true;
	}

	// Controlar que tipo de cuenta es para crear una cuenta única
	public Cuenta ingresar(String dni, Long codigo, Float cantidad) {

		Double s;
		Cliente cliente = this.clientes.get(dni);
		Cuenta cuentas = this.cuentas.get(codigo);
		if (cliente != null && cuentas != null && cuentas.getCliente().equals(cliente)) {
			s = cuentas.getSaldo() + cantidad;
			cuentas.setSaldo(s);
			return cuentas;
		} else {
			return null;
		}
	}

	public Cuenta sacarDinero(String dni, Long codigo, Float cantidad) {
		Double s;
		Cliente cliente = this.clientes.get(dni);
		Cuenta cuentas = this.cuentas.get(codigo);
		if (cliente != null && cuentas != null && cuentas.getCliente().equals(cliente)
				&& comprobarOperacion(codigo, cantidad, cuentas.getTipo())) {
			s = cuentas.getSaldo() - cantidad;
			cuentas.setSaldo(s);
			return cuentas;
		} else {
			return null;
		}
	}

	public Cuenta revisionMensual(String dni, Long codigo) {
		Cliente cliente = this.clientes.get(dni);
		Cuenta cuenta = this.cuentas.get(codigo);
		if (cliente != null && cuenta != null && cuenta.getCliente().equals(cliente)) {
			cuenta.revisionMensual();
			return cuenta;
		} else {
			return null;
		}
	}

	public Boolean comprobarOperacion(Long codigo, Float cantidad, String tipocuenta) {
		boolean aux = true;
		Cuenta cuenta = this.cuentas.get(codigo);
		if (tipocuenta.equalsIgnoreCase("CC")) {

			if ((cuenta.getSaldo() - cantidad) < 0) {
				System.out.println("Saldo negativo. No es posible realizarla");
				aux = false;
			}
		}

		if (tipocuenta.equalsIgnoreCase("CV")) {
			System.out.println("No es posible sacar dinero");
			aux = false;
		}

		if (tipocuenta.equalsIgnoreCase("FI")) {
			if ((cuenta.getSaldo() - cantidad) < -500) {
				System.out.println("Excedes el valor limite");
				aux = false;
			}
		}
		return aux;
	}

}
