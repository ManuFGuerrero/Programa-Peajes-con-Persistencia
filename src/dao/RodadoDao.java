package dao;

import datos.Rodado;

public class RodadoDao extends Dao<Rodado> {
	
	
	private static RodadoDao instance=null;
	public static RodadoDao getInstance() {
		if (instance ==null) {
			instance=new RodadoDao();
		}
		return instance;
	}
	
	public RodadoDao() {
		
	}
	
	//CDU 5 TRAER RODADO
	
	public Rodado traer(String dominio) {
		Rodado objeto=null;
		
		try {
			iniciaOperacion();
			String HQL="From Rodado r inner join fetch r.abonado where r.dominio=:dominio";
			objeto=(Rodado)session.createQuery(HQL)
					.setParameter("dominio",dominio)
					.uniqueResult();
			
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		
		return objeto;
	}
	
	
	
	

}
