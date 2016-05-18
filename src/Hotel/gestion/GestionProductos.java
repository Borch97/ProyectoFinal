package Hotel.gestion;

import Hotel.base.Huesped;
import Hotel.base.Producto;
import Hotel.utilidades.Utilidades;

public class GestionProductos {

	
	Producto[] aProduct = new Producto[500];
	
	
	public int checkFirst(Producto[] aProduct){
		int pos = 0;
		for (int i = 0;i<aProduct.length;i++){
			if(aProduct[i].getNombre()== null){
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	public void addProduct(){
		Producto h = new Producto();
		aProduct[checkFirst(aProduct)] = h.leer();
	}
	
	public void renewStock(){
		int cont = 0;
		for (int i = 0;i<aProduct.length;i++) {
			System.out.println(cont + ".-" + aProduct[i].getNombre());
			cont++;
		}
		System.out.print("Seleccione el producto del cual desea renovar el stock: ");
		int opc = Utilidades.leerEntero();
		System.out.print("Seleccione la cantidad a incrementar: ");
		int cant = Utilidades.leerEntero();
		aProduct[opc].setStock(aProduct[opc].getStock() + cant);
	}
	
	public void changePrize(){
		int cont = 0;
		for (int i = 0;i<aProduct.length;i++) {
			System.out.println(cont + ".-" + aProduct[i].getNombre());
			cont++;
		}
		System.out.print("Seleccione el producto del cual desea cambiar el precio: ");
		int opc = Utilidades.leerEntero();
		System.out.print("Seleccione el nuevo precio: ");
		int cant = Utilidades.leerEntero();
		aProduct[opc].setPrecio(aProduct[opc].getPrecio() + cant);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
