package pe.com.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.com.dao.ICategoriaDao;
import pe.com.entity.Categoria;

public class CategoriaDaoImpl implements ICategoriaDao {
	@PersistenceContext(unitName = "DriveMotors")
	private EntityManager em;
@Transactional	
@Override
	public void insertar(Categoria categoria) {
	try {
		em.persist(categoria);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}
@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> listar() {
		List<Categoria> lista = new ArrayList<Categoria>();
		try {
			Query q = em.createQuery("select m from Motor m");
			lista = (List<Categoria>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
	@Transactional
	@Override
	public void delete(int idCategoria) {
		Categoria mot = new Categoria();
		try {
			mot = em.getReference(Categoria.class, idCategoria);
			em.remove(mot);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
