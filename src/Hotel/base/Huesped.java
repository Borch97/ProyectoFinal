package Hotel.base;

import Hotel.utilidades.Utilidades;
import Hotel.gestion.GestionClientes;

public class Huesped {

	
	private String nombre;
	
	private String apellido;
	
	private String dni;
	
	private String pasaporte;
	
	private int puntos;
	
	private int cuentaFinal;
	
	private int nHabitacion;
	
	private int tiempoEstancia;
	
	private String tipoCliente;
	
	//private Servicios servicios;
	
	private String Nacionalidad;
	
	private int telefono;
	
	private String email;
	
	private String wifiPass;
	
	
	public Huesped(){}
	
	
	public Huesped(String nombre, String apellido, String dni, String pasaporte, int puntos, int cuentaFinal,
			int nHabitacion, int tiempoEstancia, String tipoCliente, String nacionalidad, int telefono,
			String email, String wifiPass) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.pasaporte = pasaporte;
		this.puntos = puntos;
		this.cuentaFinal = cuentaFinal;
		this.nHabitacion = nHabitacion;
		this.tiempoEstancia = tiempoEstancia;
		this.tipoCliente = tipoCliente;
		this.Nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.email = email;
		this.wifiPass = wifiPass;
	}



	public String getWifiPass() {
		return wifiPass;
	}


	public void setWifiPass(String wifiPass) {
		this.wifiPass = wifiPass;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getPasaporte() {
		return pasaporte;
	}



	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}



	public int getPuntos() {
		return puntos;
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public int getCuentaFinal() {
		return cuentaFinal;
	}



	public void setCuentaFinal(int cuentaFinal) {
		this.cuentaFinal = cuentaFinal;
	}



	public int getnHabitacion() {
		return nHabitacion;
	}



	public void setnHabitacion(int nHabitacion) {
		this.nHabitacion = nHabitacion;
	}



	public int getTiempoEstancia() {
		return tiempoEstancia;
	}



	public void setTiempoEstancia(int tiempoEstancia) {
		this.tiempoEstancia = tiempoEstancia;
	}



	public String getTipoCliente() {
		return tipoCliente;
	}



	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}



	public String getNacionalidad() {
		return Nacionalidad;
	}



	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	
	public Huesped leer(){
		System.out.print("Introduzca el nombre del Huesped: ");
		this.nombre = Utilidades.leerCadena();
		System.out.print("Introduzca el apellido del Huesped: ");
		this.apellido = Utilidades.leerCadena();
		System.out.print("Introduzca el documento nacional de identidad(DNI)del Huesped: ");
		this.dni = Utilidades.leerCadena();
		System.out.print("Introduzca el passaporte del Huesped: ");
		this.pasaporte = Utilidades.leerCadena();
		System.out.print("Introduzca la fecha de salida del Huesped: ");
		this.tiempoEstancia = Utilidades.leerEntero();
		System.out.print("Introduzca el tipo de cliente: ");
		this.tipoCliente = Utilidades.leerCadena();
		System.out.print("Introduzca la nacionalidad del Huesped: ");
		this.Nacionalidad = Utilidades.leerCadena();
		System.out.print("Introduzca el número de contacto del Huesped: ");
		this.telefono = Utilidades.leerEntero();
		System.out.print("Introduzca el email del Hueped: ");
		this.email = Utilidades.leerCadena();
		GestionClientes a = new GestionClientes();
		
		return new Huesped(this.nombre,this.apellido,this.dni,this.pasaporte,0,0,this.nHabitacion,this.tiempoEstancia,this.tipoCliente,this.Nacionalidad,this.telefono,this.email,a.newPass());
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
