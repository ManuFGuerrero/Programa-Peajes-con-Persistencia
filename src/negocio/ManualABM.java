package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.ManualDao;
import dao.PeajeDao;
import datos.Manual;

public class ManualABM {
	
	private static ManualABM instance=null;
	public static ManualABM getInstance() {
		if (instance ==null) {
			instance=new ManualABM();
		}
		return instance;
	}
	
	public ManualABM() {
		
	}
	
	//CDU 1 TRAER LISTA DE PEAJES MANUALES
	
	public List<Manual> traer(){
		return ManualDao.getInstance().traerManual();
	}
	//CDU 3
	public List<Manual> traer(LocalDate fecha){
		System.out.println(fecha);
		return ManualDao.getInstance().traerManual(fecha);
	}
	
	//CDU 4 CALCULAR TOTAL DE UN DIA
	public double cerrarCaja(LocalDate fecha) {
		double total=0;
		
		for (Manual m : ManualDao.getInstance().traerManual(fecha)) {
			total+=m.getPrecio();
		}
		
		return total;
	}
}
