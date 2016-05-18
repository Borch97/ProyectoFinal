package Hotel.gui;

public class Usuario {
	
	private String usuario;
	private String contrase�a;
	private String Tipo;
	
	public Usuario() {}
	
	
	
	public Usuario(String usuario, String contrase�a) {
		super();
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}



	public Usuario(String usuario, String contrase�a, String Tipo) {
		super();
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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
	 * @return the contrase�a
	 */
	public String getContrase�a() {
		return contrase�a;
	}
	/**
	 * @param contrase�a the contrase�a to set
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
