package dao;

import java.util.List;

import datos.Abonado;
import datos.Rodado;
import datos.Telepeaje;

public class TelepeajeDao extends Dao<Telepeaje>{
	
	private static TelepeajeDao instance=null;
	public static TelepeajeDao getInstance() {
		if (instance ==null) {
			instance=new TelepeajeDao();
		}
		return instance;
	}
	
	public TelepeajeDao() {
		
	}
	
	//CDU 2 TRAER LISTA DE TELEPEAJES
	@SuppressWarnings("unchecked")
	public List<Telepeaje> traerTelepeaje(){
		List<Telepeaje> lista=null;
		
		try {
			iniciaOperacion();
			String HQL="From Telepeaje t inner join fetch t.rodado ";
			lista=session.createQuery(HQL).list();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return lista;
	}
	
	//CDU 6 TRAER LISTA DE TELEPEAJES SEGUN EL RODADO
	@SuppressWarnings("unchecked")
	public List<Telepeaje> traerTelepeaje(Rodado rodado){
		List<Telepeaje> lista=null;
		
		try {
			iniciaOperacion();
			String HQL="From Telepeaje t inner join fetch t.rodado r WHERE r.id=:id ";
			lista=session.createQuery(HQL)
					.setParameter("id",rodado.getId())
					.list();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return lista;
	}

	
	//CDU 6 TRAER LISTA DE TELEPEAJES SEGUN EL ABONADO
	@SuppressWarnings("unchecked")
	public List<Telepeaje> traerTelepeaje(Abonado abonado){
		List<Telepeaje> lista=null;
		
		try {
			iniciaOperacion();
			String HQL="From Telepeaje t inner join fetch t.rodado r inner join fetch r.abonado a  WHERE a.dni=:dni  ";
			lista=session.createQuery(HQL)
					.setParameter("dni",abonado.getDni())
					.list();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return lista;
	}
}
