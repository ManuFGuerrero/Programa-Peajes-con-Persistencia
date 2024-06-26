package datos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Telepeaje extends Peaje{
	
	private Rodado rodado;
	private String lector;
	
	public Telepeaje() {
		
	}
	
	public Telepeaje(LocalDate fecha, LocalTime hora, double precio, Rodado rodado, String lector) {
		super(fecha, hora, precio);
		this.rodado = rodado;
		this.lector = lector;
	}
	public Rodado getRodado() {
		return rodado;
	}
	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}
	public String getLector() {
		return lector;
	}
	public void setLector(String lector) {
		this.lector = lector;
	}
	@Override
	public String toString() {
		return "Telepeaje ["+super.toString()+ ",lector=" + lector + "]";
	}
	
	public String toStringConRodado() {
		return this.toString()+"Rodado="+rodado;
	}
	
	public double calcularDescuento(double porcentajeDescuento) {
		double precioFinal=this.precio;
		LocalTime horaAntes=LocalTime.of(07, 00);
		LocalTime horaDespues =LocalTime.of(19, 00);
		boolean sentencia=
				this.fecha.getDayOfWeek().getValue() ==6 
				|| this.fecha.getDayOfWeek().getValue() ==7 
				|| this.hora.isBefore(horaAntes) 
				|| this.hora.isAfter(horaDespues) ;
		
		if (sentencia ) {
			precioFinal=precioFinal-precioFinal*porcentajeDescuento/100;
		}
		
		return precioFinal;
	}
	

}
