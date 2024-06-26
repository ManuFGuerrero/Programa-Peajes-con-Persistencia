package negocio;

import dao.AbonadoDao;
import datos.Abonado;

public class AbonadoABM {
	
	private static AbonadoABM instance=null;
	public static AbonadoABM getInstance() {
		if (instance ==null) {
			instance=new AbonadoABM();
		}
		return instance;
	}
	
	public AbonadoABM() {
		
	}
	
//	CDU 7 TRAER ABONADO POR DNI
	
	public Abonado traer(long dni) {
		return AbonadoDao.getInstance().traer(dni);
	}
	
	
}
