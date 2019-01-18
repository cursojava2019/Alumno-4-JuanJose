package es.indra.model;

import es.indra.model.entities.Comprador;
import es.indra.model.support.Dao;
import es.indra.model.support.Service;

public class CompradorService extends Service<String, Comprador> {

	CompradorDao dao = null;

	@Override
	protected Dao<String, Comprador> getDao() {
		if (this.dao == null) {
			this.dao = new CompradorDao();
		}
		return this.dao;
	}

}
