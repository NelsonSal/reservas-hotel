package modelo;

import java.sql.Date;

public class Reserva {
	private int idReserva;
	private Date fechaIn;
	private Date fechaOut;
	private String valorReserva;
	private String formaDePago;
	private double tarifa=500;
	
	
	
	
	public Reserva() {
	}

	public Reserva(Date fechaIn, Date fechaOut, String valorReserva, String formaDePago) {
		this.fechaIn=fechaIn;
		this.fechaOut=fechaOut;
		this.valorReserva=valorReserva;
		this.formaDePago=formaDePago;
	}
	
	
	
	

public Reserva(int idReserva, Date fechaIn, Date fechaOut, String valorReserva, String formaDePago) {
		this.idReserva = idReserva;
		this.fechaIn = fechaIn;
		this.fechaOut = fechaOut;
		this.valorReserva = valorReserva;
		this.formaDePago = formaDePago;
	}


	
	public Date getFechaIn() {
		return fechaIn;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public void setFechaIn(Date fechaIn) {
		this.fechaIn = fechaIn;
	}

	public Date getFechaOut() {
		return fechaOut;
	}

	public void setFechaOut(Date fechaOut) {
		this.fechaOut = fechaOut;
	}

	public String getValorReserva() {
		return valorReserva;
	}

	public void setValorReserva(String valorReserva) {
		this.valorReserva = valorReserva;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public double valorReserva(long fechaIn, long fechaOut) {
		long diferencia = fechaOut - fechaIn;
		double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
		if (dias==0) {dias=1;}
		double valor=tarifa*dias;
		return valor;
	}

}