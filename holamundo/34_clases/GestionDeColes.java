public class GestionDeColes {

	public static void main(String[] args) {

		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno();

		a1.nombre = "Luis";
		a1.dni = "111123232H";

		a2.nombre = "Sara";
		a2.dni = "1243242435P";

		a1 = a2;

		if (a1 == a2)
			System.out.println("Son iguales");

		a1.mostrar();
		a2.mostrar();
		
	}

}
