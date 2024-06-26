package test;

import java.time.LocalDate;
import java.util.List;

import dao.ManualDao;
import datos.Telepeaje;
import negocio.AbonadoABM;
import negocio.ManualABM;
import negocio.TelepeajeABM;
import negocio.PeajeABM;
import negocio.RodadoABM;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("-------CDU 1 ---------");
		System.out.println("TRAER LISTA DE PEAJES MANUALES:");
		System.out.println(ManualABM.getInstance().traer().toString());
		
		
		System.out.println("-------CDU 2 ---------");
		System.out.println("TRAER LISTA DE TELEPEAJES:");
		System.out.println(TelepeajeABM.getInstance().traer().toString());
		
		
		System.out.println("-------CDU 3 ---------");
		System.out.println("TRAER LISTA DE PEAJES MANUALES EN CIERTA FECHA:");
		System.out.println(ManualABM.getInstance().traer(LocalDate.of(2020, 11, 1)).toString());
		
		
		System.out.println("-------CDU 4 ---------");
		System.out.println("TRAER TOTAL COBRADO DE PEAJES MANUALES EN CIERTA FECHA:");
		System.out.println(ManualABM.getInstance().cerrarCaja(LocalDate.of(2020, 11, 1)));
		
		System.out.println("-------CDU 5 ---------");
		System.out.println("TRAER UN RODADO:");
		System.out.println(RodadoABM.getInstance().traer("AAA111"));
		
			
		System.out.println("-------CDU 6 ---------");
		System.out.println("TRAER LISTA DE TELEPEAJES POR RODADO Y CALCULAR DESCUENTO DE C/U:");
		List<Telepeaje> aux=TelepeajeABM.getInstance().traer(RodadoABM.getInstance().traer("AAA111"));
		for (Telepeaje t : aux) {
			System.out.printf("\nSOY EL TELEPEAJE %d MI PRECIO ES DE %f Y MI DESCUENTO ES %f",t.getIdPeaje(),t.getPrecio(),t.calcularDescuento(5));
			
		}
		
		
		System.out.println("-------CDU 7 ---------");
		System.out.println("TRAER UN ABONADO:");
		System.out.println(AbonadoABM.getInstance().traer(11111111));
		
		System.out.println("-------CDU 8 ---------");
		System.out.println("TRAER LISTA DE TELEPEAJES POR ABONADO :");
		aux=TelepeajeABM.getInstance().traer(AbonadoABM.getInstance().traer(11111111));
		for (Telepeaje t : aux) {
			System.out.println(t.toStringConRodado());
		}
	}

}
