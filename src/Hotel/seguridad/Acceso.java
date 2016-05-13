package Hotel.seguridad;

public class Acceso {

	private String usuario;
	
	private String password;
	
	private String tipoAcceso;
	
	
	
	public Acceso(String usuario, String password, String tipoAcceso) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.tipoAcceso = tipoAcceso;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getTipoAcceso() {
		return tipoAcceso;
	}



	public void setTipoAcceso(String tipoAcceso) {
		this.tipoAcceso = tipoAcceso;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
