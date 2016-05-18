package Hotel.gestion;

import Hotel.base.Habitacion;
import Hotel.base.Huesped;
import Hotel.utilidades.Utilidades;

public class GestionHabitaciones {

	public int[] aId = new int[999];
	Habitacion[] aRoom = new Habitacion[1000];
	/*public boolean checkId(int[] aId){
		boolean check = false;
		for(int i = 0;i<aId.length;i++){
			if(aId[i] != 0){
				check = true;
				break;
			}
		}return check;
	}*/
	
	public int checkFirst(Habitacion[] aRoom){
		int pos = 0;
		for (int i = 0;i<aRoom.length;i++){
			if(aRoom[i].getTipo()== null){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public void addRoom(){
		Habitacion h = new Habitacion();
		aRoom[checkFirst(aRoom)] = h.leer();
	}
	
	public void changePrize(){
		int cont = 0;
		for (int i = 0;i<aRoom.length;i++) {
			System.out.println(cont + ".-" + aRoom[i].getId());
			cont++;
		}
		System.out.print("Seleccione la habitación a la cual desea cambiar el precio: ");
		int opc = Utilidades.leerEntero();
		System.out.print("Seleccione el nuevo precio: ");
		int cant = Utilidades.leerEntero();
		aRoom[opc].setPrecio(aRoom[opc].getPrecio() + cant);
	}
	
	public void changeType(){
		int cont = 0;
		for (int i = 0;i<aRoom.length;i++) {
			System.out.println(cont + ".-" + aRoom[i].getId());
			cont++;
		}
		System.out.print("Seleccione la habitación a la cual desea cambiar el tipo: ");
		int opc = Utilidades.leerEntero();
		System.out.print("Seleccione el nuevo tipo: ");
		String tipo = Utilidades.leerCadena();
		aRoom[opc].setTipo(tipo);
	}
	
	public void changeStatus(){
		int cont = 0;
		for (int i = 0;i<aRoom.length;i++) {
			System.out.println(cont + ".-" + aRoom[i].getNumeroHabitacion());
			cont++;
		}
		System.out.print("Seleccione la habitación a la cual desea cambiar el estado: ");
		int opc = Utilidades.leerEntero();
		System.out.print("Seleccione el nuevo estado: ");
		String est = Utilidades.leerCadena();
		aRoom[opc].setEstado(est);
	}
	
	public Habitacion viewRoom(Habitacion[] aRoom){
		int cont = 0;
		for (int i = 0;i<aRoom.length;i++) {
			System.out.println(cont + ".-" + aRoom[i].getNumeroHabitacion());
			cont++;
		}
		System.out.print("Seleccione una de las Habitaciones mostradas: ");
		int opc = Utilidades.leerEntero();
		return aRoom[opc];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
