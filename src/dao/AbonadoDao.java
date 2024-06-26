package dao;

import datos.Abonado;
import datos.Rodado;

public class AbonadoDao extends Dao<Abonado> {

	
	private static AbonadoDao instance=null;
	public static AbonadoDao getInstance() {
		if (instance ==null) {
			instance=new AbonadoDao();
		}
		return instance;
	}
	
	public AbonadoDao() {
		
	}
	
	//CDU 7 TRAER ABONADO POR DNI
	
	public Abonado traer(long dni) {
		Abonado objeto=null;
		
		try {
			iniciaOperacion();
			String HQL="From Abonado a where a.dni=:dni";
			objeto=(Abonado)session.createQuery(HQL)
					.setParameter("dni",dni)
					.uniqueResult();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return objeto;
	}
	
	
}
