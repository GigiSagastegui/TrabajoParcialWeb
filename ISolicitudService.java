package pe.com.service;

import java.util.List;

import pe.com.entity.Solicitud;

public interface ISolicitudService {
	public void insertar(Solicitud solicitud );

	public List<Solicitud> listar();

	public void eliminar(int idSolicitud);
}


