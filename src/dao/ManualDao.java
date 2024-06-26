package dao;

import java.time.LocalDate;
import java.util.List;

import datos.Manual;
public class ManualDao extends Dao<Manual>{

	
	private static ManualDao instance=null;
	public static ManualDao getInstance() {
		if (instance ==null) {
			instance=new ManualDao();
		}
		return instance;
	}
	
	public ManualDao() {
		
	}
	
	//CDU 1 TRAER LISTA DE PEAJES MANUALES
	
	@SuppressWarnings("unchecked")
	public List<Manual> traerManual(){
		List<Manual> lista=null;
		
		try {
			iniciaOperacion();
			String HQL="From Manual m ";
			lista=session.createQuery(HQL).list();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return lista;
	}
	
	//CDU 3 TRAER LISTA DE PEAJES MANUALES EN DETERMINADA FECHA
	
	@SuppressWarnings("unchecked")
	public List<Manual> traerManual(LocalDate fecha){
		List<Manual> lista=null;
		
		try {
			iniciaOperacion();
			String HQL="From Manual m where m.fecha=:fecha";
			lista=session.createQuery(HQL)
					.setParameter("fecha",fecha)
					.list();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return lista;
	}

	
}
