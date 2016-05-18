package Hotel.gestion;

import Hotel.base.Habitacion;
import Hotel.base.Reserva;

public class GestionReservas {

	Reserva[] aReserves = new Reserva[1000];
	
	
	public int nextReserva(int[] aReservas){
		int elc = -1;
		for(int i = 0;i<aReservas.length;i++){
			if(aReservas[i] != 0){
				elc = i;
			}
		}return elc;
	}
	
	public int checkFirst(Reserva[] aReserves){
		int pos = 0;
		for (int i = 0;i<aReserves.length;i++){
			if(aReserves[i].getnReserva()== 0){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public void addReserve(){
		Reserva h = new Reserva();
		aReserves[checkFirst(aReserves)] = h.leer();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
