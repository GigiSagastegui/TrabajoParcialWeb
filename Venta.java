package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ventas")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVenta;
	
	@Column(name="descripcionVenta",nullable=false,length=50)
	private String descripcionVenta;
	
	@Column(name="stockVenta",nullable=false,length=50)
	private String stockVenta;
	
	@Column(name="sedeVenta",nullable=false,length=50)
	private String sedeVenta;
	@Column(name="precioBVenta",nullable=false,length=50)
	private String precioBVenta;
	@Column(name="fechainicioVenta",nullable=false,length=50)
	private String fechainicioVenta;
	@Column(name="fechafinVenta",nullable=false,length=50)
	private String fechafinVenta;
	
	

	
	
	
}
