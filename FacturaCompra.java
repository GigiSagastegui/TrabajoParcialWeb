package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factorascompra")
public class FacturaCompra implements Serializable   {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFacturaC;
	
	@Column(name="montoFactura",nullable=false,length=50)
	private String montoFactura;
	
	@Column(name="cantFactura",nullable=false,length=50)
	private String cantFactura;

	public FacturaCompra(int idFacturaC, String montoFactura, String cantFactura) {
		super();
		this.idFacturaC = idFacturaC;
		this.montoFactura = montoFactura;
		this.cantFactura = cantFactura;
	}

	public FacturaCompra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdFacturaC() {
		return idFacturaC;
	}

	public void setIdFacturaC(int idFacturaC) {
		this.idFacturaC = idFacturaC;
	}

	public String getMontoFactura() {
		return montoFactura;
	}

	public void setMontoFactura(String montoFactura) {
		this.montoFactura = montoFactura;
	}

	public String getCantFactura() {
		return cantFactura;
	}

	public void setCantFactura(String cantFactura) {
		this.cantFactura = cantFactura;
	}
	

}
