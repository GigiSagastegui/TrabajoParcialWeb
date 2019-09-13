package pe.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="solicitudes")
public class Solicitud implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSolicitud;
	
	@Column(name="descripcionSolicitud",nullable=false,length=50)
	private String descripcionSolicitud;
	private Date fechaSolicitud;
	public Solicitud(int idSolicitud, String descripcionSolicitud, Date fechaSolicitud) {
		super();
		this.idSolicitud = idSolicitud;
		this.descripcionSolicitud = descripcionSolicitud;
		this.fechaSolicitud = fechaSolicitud;
	}
	public Solicitud() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getDescripcionSolicitud() {
		return descripcionSolicitud;
	}
	public void setDescripcionSolicitud(String descripcionSolicitud) {
		this.descripcionSolicitud = descripcionSolicitud;
	}
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	
	
}
