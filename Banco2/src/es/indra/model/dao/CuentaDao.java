package es.indra.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import es.indra.model.entities.Cliente;
import es.indra.model.entities.Cuenta;
import es.indra.model.support.DaoException;
import es.indra.model.support.DatosConexion;

public class CuentaDao {

private Connection getConexion() throws SQLException{
		
		Connection co = DriverManager.getConnection(DatosConexion.URL, DatosConexion.USUARIO_BD, DatosConexion.PASSWORD_BD);
		
		return co;
		
	}

	@Override
	public void create(Cuenta entity) throws DaoException {
		
		try {
			
			Connection co = getConexion();
			PreparedStatement ps = co.prepareStatement("INSERT INTO CLIENTE VALUES (?,?,?,?,?)");
			ps.setLong(1, entity.getCodigo());
			ps.setString(2, entity.getTipo());
			ps.setFloat(3, entity.getComision());
			ps.setDouble(4, entity.getSaldo());
			ps.setBoolean(5, entity.getBloqueada());
			ps.executeUpdate();
			co.close();
			
		}catch(SQLException e) {
			System.out.println("Error creando objeto en BBDD");
			throw new DaoException();
		}
		
	}

	@Override
	public void update(Cliente entity) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String key) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente find(String key) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAll() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
