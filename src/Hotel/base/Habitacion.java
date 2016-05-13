package Hotel.base;

import java.util.Random;

import Hotel.gestion.GestionHabitaciones;
import Hotel.utilidades.Utilidades;

public class Habitacion {

	private int id;
	
	private String estado;
	
	private String tipo;
	
	private double precio;
	
	private int numeroHabitacion;
	
	private int piso;
	
	private String estadoPago;
	
	private String fechaIn;
	
	private String fechaOut;
	
	//private Servicios sDisponibles;
	
	
	public Habitacion(int id, String estado, String tipo, double precio, int numeroHabitacion, int piso,
			String estadoPago, String fechaIn, String fechaOut) {
		super();
		this.id = id;
		this.estado = estado;
		this.tipo = tipo;
		this.precio = precio;
		this.numeroHabitacion = numeroHabitacion;
		this.piso = piso;
		this.estadoPago = estadoPago;
		this.fechaIn = fechaIn;
		this.fechaOut = fechaOut;
	}

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}



	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}



	public int getPiso() {
		return piso;
	}



	public void setPiso(int piso) {
		this.piso = piso;
	}



	public String getEstadoPago() {
		return estadoPago;
	}



	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}



	public String getFechaIn() {
		return fechaIn;
	}



	public void setFechaIn(String fechaIn) {
		this.fechaIn = fechaIn;
	}



	public String getFechaOut() {
		return fechaOut;
	}



	public void setFechaOut(String fechaOut) {
		this.fechaOut = fechaOut;
	}


	public Habitacion leer(){
		System.out.print("Introduzca el estado de la Habitación: ");
		this.estado = Utilidades.leerCadena();
		System.out.print("Introduzca el tipo de Habitación: ");
		this.tipo = Utilidades.leerCadena();
		System.out.print("Introduzca el precio de la Habitación: ");
		this.precio = Utilidades.leerReal();
		System.out.print("Introduzca el número de Habitación: ");
		this.numeroHabitacion = Utilidades.leerEntero();
		System.out.print("Introduzca el piso en el que se encuentra la Habitación: ");
		this.piso = Utilidades.leerEntero();
		
		
		return new Habitacion(aleatorioId(),this.estado,this.tipo,this.precio,this.numeroHabitacion,this.piso,this.estadoPago,this.fechaIn,this.fechaOut);
	}
	GestionHabitaciones g = new GestionHabitaciones();
	
	public int aleatorioId(){
		int min = 0; int max = 999 ;
		Random random = new Random();
		int id = (int)random.nextInt(max - min + 1) + min;
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
