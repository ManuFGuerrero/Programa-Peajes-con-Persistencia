package negocio;

import java.time.LocalDate;
import java.util.List;


import dao.PeajeDao;
import datos.Manual;
public class PeajeABM {
	
	private static PeajeABM instance=null;
	public static PeajeABM getInstance() {
		if (instance ==null) {
			instance=new PeajeABM();
		}
		return instance;
	}
	
	public PeajeABM() {
		
	}
	


}
