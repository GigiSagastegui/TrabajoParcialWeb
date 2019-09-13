package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="almaceneros")
public class Almacenero implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAlmacenero;
	public Almacenero(int idAlmacenero) {
		super();
		this.idAlmacenero = idAlmacenero;
	}
	public Almacenero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAlmacenero() {
		return idAlmacenero;
	}
	public void setIdAlmacenero(int idAlmacenero) {
		this.idAlmacenero = idAlmacenero;
	}
	

}
