package dao;

import java.time.LocalDate;
import java.util.List;

import datos.Manual;
import datos.Peaje;

public class PeajeDao extends Dao<Peaje>{

	private static PeajeDao instance=null;
	public static PeajeDao getInstance() {
		if (instance ==null) {
			instance=new PeajeDao();
		}
		return instance;
	}
	
	public PeajeDao() {
		
	}
	


}
