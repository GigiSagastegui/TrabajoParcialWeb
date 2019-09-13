package pe.com.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.com.dao.ISolicitudDao;
import pe.com.entity.Solicitud;

public class SolicitudDaoImpl implements ISolicitudDao{
@PersistenceContext(unitName = "DriveMotors")
private EntityManager em;


@Transactional
@Override
public void insert(Solicitud solicitud) {
	try {
		em.persist(solicitud);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	
}
@SuppressWarnings("unchecked")
@Override
public List<Solicitud> list() {
	List<Solicitud> lista = new ArrayList<Solicitud>();
	try 
		{Query q = em.createQuery("select m from Solicitud m");
		lista = (List<Solicitud>) q.getResultList();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return lista;
}
@Transactional
@Override
public void delete(int idSolicitud) {
	 Solicitud sol = new Solicitud();
	try {
		sol= em.getReference(Solicitud.class, idSolicitud);
		em.remove(sol);

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}}

