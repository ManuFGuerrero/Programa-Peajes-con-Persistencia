package negocio;

import dao.RodadoDao;
import datos.Rodado;

public class RodadoABM {
	
	
	private static RodadoABM instance=null;
	public static RodadoABM getInstance() {
		if (instance ==null) {
			instance=new RodadoABM();
		}
		return instance;
	}
	
	public RodadoABM() {
		
	}
	
	//CDU 5 
	
	public Rodado traer(String dominio) {
		return RodadoDao.getInstance().traer(dominio);
	}
}
