package es.indra.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;

public class Banco implements Serializable {

	private TreeMap<String, Cliente> clientes;
	private ArrayList<Cuenta> cuentas;

	public Banco() {
		this.clientes = new TreeMap<String, Cliente>();
		this.cuentas = new ArrayList<Cuenta>();
	}

	public TreeMap<String, Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(TreeMap<String, Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Cuenta> getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

}
