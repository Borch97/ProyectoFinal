package Hotel.base;

import Hotel.utilidades.Utilidades;

public class Producto {

	private String nombre;
	
	private int stock;
	
	private double precio;
	
	public Producto(){}
	
	
	public Producto(String nombre, int stock, double precio) {
		super();
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Producto leer(){
		System.out.print("Introduzca el nombre del producto: ");
		this.nombre = Utilidades.leerCadena();
		System.out.print("Introduzca el precio del producto: ");
		this.precio = Utilidades.leerReal();
		System.out.print("Introduzca el stock inicial del producto: ");
		this.stock = Utilidades.leerEntero();
		return new Producto(this.nombre,this.stock,this.precio);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
