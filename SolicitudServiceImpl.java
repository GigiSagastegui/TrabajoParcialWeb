package pe.com.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.com.dao.ISolicitudDao;
import pe.com.entity.Solicitud;
import pe.com.service.ISolicitudService;
@Named
@RequestScoped
public class SolicitudServiceImpl implements ISolicitudService {
	
	@Inject
	private ISolicitudDao mD;

	@Override
	public void insertar(Solicitud solicitud) {
		try {
			mD.insert(solicitud);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Solicitud> listar() {
		return mD.list();
	}

	@Override
	public void eliminar(int idSolicitud) {
		mD.delete(idSolicitud);
	}


}
