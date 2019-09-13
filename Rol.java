package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="roles")
public class Rol implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRol;
	@Column(name="descripcionRol",nullable=false,length=50)
	private String descripcionRol;
	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rol(int idRol, String descripcionRol) {
		super();
		this.idRol = idRol;
		this.descripcionRol = descripcionRol;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public String getDescripcionRol() {
		return descripcionRol;
	}
	public void setDescripcionRol(String descripcionRol) {
		this.descripcionRol = descripcionRol;
	}
	
}
