package Hotel.gestion;

import Hotel.base.Huesped;
import Hotel.utilidades.Generar;
import Hotel.utilidades.Utilidades;

public class GestionClientes {

	public Huesped[] aClientes = new Huesped[1000];
	
	public int checkFirst(Huesped[] aClientes){
		int pos = 0;
		for (int i = 0;i<aClientes.length;i++){
			if(aClientes[i].getNombre()== null){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public Huesped viewClients(Huesped[] aClientes){
		int cont = 0;
		for (int i = 0;i<aClientes.length;i++) {
			System.out.println(cont + ".-" + aClientes[i].getNombre() + " " + aClientes[i].getApellido());
			cont++;
		}
		System.out.print("Seleccione uno de los clientes mostrados: ");
		int opc = Utilidades.leerEntero();
		return aClientes[opc];
	}
	
	public String newPass(){
		Generar g = new Generar();
		String xalea = Integer.toHexString(g.aleatorio(200,50000));
		return xalea;
	}
	
	public void addClient(){
		Huesped h = new Huesped();
		aClientes[checkFirst(aClientes)] = h.leer();
	}
	//Pendiente Ventanas
	public void modifyClient(){
		int cont = 0;
		for (int i = 0;i<aClientes.length;i++) {
			System.out.println(cont + ".-" + aClientes[i].getNombre() + " " + aClientes[i].getApellido());
			cont++;
		}
		System.out.print("Seleccione el cliente a modificar: ");
		int opc = Utilidades.leerEntero();
		while(opc<0 && opc > aClientes.length){
			System.out.print("Error. Introduzca un cliente valido: ");
			opc = Utilidades.leerEntero();
		}
		System.out.print("Seleccione el dato que desea modificar(Nombre/Apellido/dni/...: ");
		String change = Utilidades.leerCadena().toLowerCase();
		System.out.print("Seleccione el nuevo dato: ");
		String newData = Utilidades.leerCadena();
		
	}
	
	public static void main(String[] args) {
		GestionClientes p = new GestionClientes();
		System.out.println(p.newPass());
	}

}
