package pe.com.service;

import java.util.List;

import pe.com.entity.Categoria;

public interface ICategoriaService  {
	public void insertar(Categoria categoria);

	public List<Categoria> listar();

	public void eliminar(int idCategoria);
}
