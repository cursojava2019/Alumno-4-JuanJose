package es.indra.controller;

import java.io.Serializable;
import java.util.TreeMap;

import es.indra.model.Cliente;
import es.indra.model.CuentaCorriente;
import es.indra.model.CuentaVivienda;
import es.indra.model.FondoInversion;

public class Banco implements Serializable {

	private TreeMap<String, Cliente> clientes;
	private TreeMap<Long, CuentaCorriente> cuentasCorrientes;
	private TreeMap<Long, CuentaVivienda> cuentasVivienda;
	private TreeMap<Long, FondoInversion> fondosInversion;

	public Banco() {
		this.clientes = new TreeMap<String, Cliente>();
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

}
