package pe.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="categorias")
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCategoria;
	
	@Column(name="descripcionCategoria",nullable=false,length=50)
	private String descrpcionCategoria;

	public Categoria(int idCategoria, String descrpcionCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.descrpcionCategoria = descrpcionCategoria;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescrpcionCategoria() {
		return descrpcionCategoria;
	}

	public void setDescrpcionCategoria(String descrpcionCategoria) {
		this.descrpcionCategoria = descrpcionCategoria;
	}


}
