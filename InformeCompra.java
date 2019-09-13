package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="informescompra")
public class InformeCompra implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idInforme;
	
	@Column(name="descripcionInforme",nullable=false,length=50)
	private String descripcionInforme;

	public InformeCompra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InformeCompra(int idInforme, String descripcionInforme) {
		super();
		this.idInforme = idInforme;
		this.descripcionInforme = descripcionInforme;
	}

	public int getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}

	public String getDescripcionInforme() {
		return descripcionInforme;
	}

	public void setDescripcionInforme(String descripcionInforme) {
		this.descripcionInforme = descripcionInforme;
	}



}
