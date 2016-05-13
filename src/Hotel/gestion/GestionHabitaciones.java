package Hotel.gestion;

public class GestionHabitaciones {

	public int[] aId = new int[999];
	
	public boolean checkId(int[] aId){
		boolean check = false;
		for(int i = 0;i<aId.length;i++){
			if(aId[i] != 0){
				check = true;
				break;
			}
		}return check;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
