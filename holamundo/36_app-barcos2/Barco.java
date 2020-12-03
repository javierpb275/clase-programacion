import java.util.Scanner;

public class Barco {

	String matricula;
	String nombre;

	public void mostrar() {
		System.out.println(this.matricula);
		System.out.println(this.nombre);
	}

	public void obtenerDatos() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre:");
		this.nombre = sc.nextLine();
		System.out.println("Matricula:");
		this.matricula = sc.nextLine();
	}


}
