package Hotel.gui;

import Hotel.gui.Usuario;

public interface ILogin {
	public boolean login(String usuario, String contraseña);
	public boolean registro(Usuario u);
	public String recuperarContraseña(String usuario);
}
