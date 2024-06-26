package negocio;

import java.util.List;

import dao.TelepeajeDao;
import datos.Abonado;
import datos.Rodado;
import datos.Telepeaje;

public class TelepeajeABM {
	
	private static TelepeajeABM instance=null;
	public static TelepeajeABM getInstance() {
		if (instance ==null) {
			instance=new TelepeajeABM();
		}
		return instance;
	}
	
	public TelepeajeABM() {
		
	}

	//CDU 2 TRAER LISTA DE TELEPEAJES
	
	public List<Telepeaje> traer(){
		return TelepeajeDao.getInstance().traerTelepeaje();
	}
	
	//CDU 5 TRAER LISTA DE TELEPEAJES POR RODADO
	
	public List<Telepeaje> traer(Rodado rodado){
		return TelepeajeDao.getInstance().traerTelepeaje(rodado);
	}
	
	//CDU 5 TRAER LISTA DE TELEPEAJES POR ABONADO
	
	public List<Telepeaje> traer(Abonado abonado){
		return TelepeajeDao.getInstance().traerTelepeaje(abonado);
	}
	
}
