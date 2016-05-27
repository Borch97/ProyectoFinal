package Hotel.gui;

import Hotel.gui.Usuario;

public interface ILogin {
	public boolean login(String usuario, String contraseņa);
	public boolean registro(Usuario u);
	public String recuperarContraseņa(String usuario);
}
