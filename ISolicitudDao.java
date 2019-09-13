package pe.com.dao;

import java.util.List;

import pe.com.entity.Solicitud;

public interface ISolicitudDao {
	public void insert(Solicitud solicitud);

	public List<Solicitud > list();

	public void delete(int idSolicitud);

}
