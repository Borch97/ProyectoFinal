package Hotel.base;

public class Empleado {

	private String nombre;
	
	private String apellido;
	
	private String dni;
	
	private String Nacionalidad;
	
	private int telefono;
	
	private String email;
	
	
	public Empleado(String nombre, String apellido, String dni, String nacionalidad, int telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		Nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.email = email;
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



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
