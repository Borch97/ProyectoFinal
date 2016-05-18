package Hotel.gestion;

import Hotel.base.Huesped;
import Hotel.utilidades.Generar;

public class GestionPuntos {

	public void addPoints(String nombre, String apellido, Huesped[] aClientes){
		Generar g = new Generar();
		for (Huesped huesped : aClientes) {
			if(huesped.getNombre().equalsIgnoreCase(nombre) && huesped.getApellido().equalsIgnoreCase(apellido)){
				if(huesped.getTiempoEstancia()> 7)
					huesped.setPuntos(g.aleatorio(100, 500));
				else if(huesped.getTiempoEstancia()> 14)
					huesped.setPuntos(g.aleatorio(500, 1000));
				else if(huesped.getTiempoEstancia()>0 && huesped.getTiempoEstancia()<7)
					huesped.setPuntos(g.aleatorio(1, 100));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
