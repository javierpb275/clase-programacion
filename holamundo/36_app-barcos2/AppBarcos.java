public class AppBarcos {

	public static void main(String[] args) {


		Barco[] myArray = new Barco[10];


		for (int i = 0; i < myArray.length; i++) {

			myArray[i] = new Barco();

			myArray[i].obtenerDatos();
		
		}


		for (int i = 0; i < myArray.length; i++) {

			myArray[i].mostrar();
			
		}


		
	}

}
