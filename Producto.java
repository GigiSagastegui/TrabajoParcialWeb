package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProducto;
	@Column(name="descripcionProducto",nullable=false,length=50)
	private String descrpcionProducto;
	@Column(name="precioProducto",nullable=false,length=50)
	private String precioProducto;
	@Column(name="fechaIngreso",nullable=false,length=50)
	private String fechaIngreso;
	@Column(name="stockProducto",nullable=false,length=50)
	private String stockProducto;
	public Producto(int idProducto, String descrpcionProducto, String precioProducto, String fechaIngreso,
			String stockProducto) {
		super();
		this.idProducto = idProducto;
		this.descrpcionProducto = descrpcionProducto;
		this.precioProducto = precioProducto;
		this.fechaIngreso = fechaIngreso;
		this.stockProducto = stockProducto;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescrpcionProducto() {
		return descrpcionProducto;
	}
	public void setDescrpcionProducto(String descrpcionProducto) {
		this.descrpcionProducto = descrpcionProducto;
	}
	public String getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(String precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(String stockProducto) {
		this.stockProducto = stockProducto;
	}
	



}
