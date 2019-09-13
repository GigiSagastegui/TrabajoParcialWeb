package pe.com.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.com.dao.ICategoriaDao;
import pe.com.entity.Categoria;
import pe.com.service.ICategoriaService;

@Named
@RequestScoped
public class CategoriaServiceImpl implements ICategoriaService {

	@Inject
	private ICategoriaDao mD;

	@Override
	public void insertar(Categoria categoria) {
		try {
			mD.insertar(categoria);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Categoria> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idCategoria) {
		mD.delete(idCategoria);
	}


}
