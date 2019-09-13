package pe.com.dao;

import java.util.List;

import pe.com.entity.Categoria;

public interface ICategoriaDao {
	public void insertar (Categoria categoria);
	public List<Categoria>listar();
	public void delete (int idCategoria);

}
