package Hotel.base;

import Hotel.gestion.GestionClientes;
import Hotel.utilidades.Generar;

public class Reserva {

	private int nReserva;
	
	private Huesped datosReserva;
	
	public Reserva(){}
	
	
	public Reserva(int nReserva, Huesped datosReserva) {
		super();
		this.nReserva = nReserva;
		this.datosReserva = datosReserva;
	}


	public int getnReserva() {
		return nReserva;
	}


	public void setnReserva(int nReserva) {
		this.nReserva = nReserva;
	}


	public Huesped getDatosReserva() {
		return datosReserva;
	}


	public void setDatosReserva(Huesped datosReserva) {
		this.datosReserva = datosReserva;
	}


	public Reserva leer(){
		Generar g = new Generar();
		GestionClientes gc = new GestionClientes();
		return new Reserva(g.aleatorio(1, 1000),gc.viewClients(gc.aClientes));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
