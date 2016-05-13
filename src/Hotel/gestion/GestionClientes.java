package Hotel.gestion;

import Hotel.base.Huesped;

public class GestionClientes {

	Huesped[] aClientes = new Huesped[1000];
	public int[] aReservas = new int[1000];
	

	public int nextReserva(int[] aReservas){
		int elc = -1;
		for(int i = 0;i<aReservas.length;i++){
			if(aReservas[i] != 0){
				elc = i;
			}
		}return elc;
	}
	
	
	public static void main(String[] args) {
	}

}
