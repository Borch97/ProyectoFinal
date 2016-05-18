package Hotel.utilidades;

import java.util.Random;

public class Generar {

	public int aleatorio(int vmin,int vmax){
		int min = vmin; int max = vmax;
		Random random = new Random();
		int aleatorio = (int)random.nextInt(max - min + 1) + min;
		return aleatorio;
}	
}
