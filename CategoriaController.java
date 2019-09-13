package pe.com.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.com.entity.Categoria;
import pe.com.service.ICategoriaService;
@Named
@RequestScoped
public class CategoriaController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ICategoriaService mS;
	private Categoria categoria;
	List<Categoria> listaCategorias;

	@PostConstruct
	public void init() {
		this.listaCategorias = new ArrayList<Categoria>();
		this.categoria = new Categoria();
		this.listar();
	}

	public String nuevoCategoria() {
		this.setCategoria(new Categoria());
		return "categoria.xhtml";
	}

	public void insertar() {
		try {
			mS.insertar(categoria);
			limpiarCategoria();
			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaCategorias = mS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarCategoria() {
		this.init();
	}

	public void eliminar(Categoria mo) {
		try {
			mS.eliminar(mo.getIdCategoria());
			listar();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getListaCategorias() {
		return listaCategorias;
	}

	public void setListaCategorias(List<Categoria> listaCategorias) {
		this.listaCategorias = listaCategorias;
	}
	
}
