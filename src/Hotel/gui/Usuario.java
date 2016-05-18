package Hotel.gui;

public class Usuario {
	
	private String usuario;
	private String contraseña;
	private String Tipo;
	
	public Usuario() {}
	
	
	
	public Usuario(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}



	public Usuario(String usuario, String contraseña, String Tipo) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.Tipo = Tipo;
	}



	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}
	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	/**
	 * @return the nombreCompleto
	 */
	public String getTipo() {
		return Tipo;
	}
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setTipo(String nombreCompleto) {
		this.Tipo = nombreCompleto;
	}

}
