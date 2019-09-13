package pe.com.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import pe.com.entity.Solicitud;
import pe.com.service.ISolicitudService;

public class SolicitudController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private ISolicitudService sS;
	private Solicitud solicitud;
	List<Solicitud> listaSolicitudes;

	@PostConstruct
	public void init() {
		this.listaSolicitudes= new ArrayList<Solicitud>();
		this.solicitud = new Solicitud();
		this.listar();
	}

	public String nuevoSolicitud() {
		this.setSolicitud(new Solicitud());
		return "solicitud.xhtml";
	}

	public void insertar() {
		try {
			sS.insertar(solicitud);
			limpiarSolicitud();
			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaSolicitudes = sS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarSolicitud() {
		this.init();
	}

	public void eliminar(Solicitud mo) {
		try {
			sS.eliminar(mo.getIdSolicitud());
			listar();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}

	public List<Solicitud> getListaSolicitudes() {
		return listaSolicitudes;
	}

	public void setListaSolicitudes(List<Solicitud> listaSolicitudes) {
		this.listaSolicitudes = listaSolicitudes;
	}
	

}
