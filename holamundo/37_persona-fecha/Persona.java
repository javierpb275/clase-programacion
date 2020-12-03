import java.util.Scanner;

public class Persona {

	Scanner sc;

	String nombre;
	String apellidos;
	Fecha fecha;


	public Persona() {

		sc = new Scanner(System.in);

		nombre = "";
		apellidos = "";
		fecha = new Fecha();

	}

	public Persona(String nombre, String apellidos, Fecha fecha) {

		sc = new Scanner(System.in);

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;

	}

	public void obtenerDatos() {

		System.out.println("Nombre:");
		this.nombre = sc.nextLine();
		System.out.println("Apellidos:");
		this.apellidos = sc.nextLine();

		System.out.println("Dia:");
		this.fecha.dia = sc.nextInt();
		System.out.println("Mes:");
		this.fecha.mes = sc.nextInt();
		System.out.println("Ano:");
		this.fecha.ano = sc.nextInt();

	}

	public void mostrarDatos() {
		System.out.println(this.nombre);
		System.out.println(this.apellidos);
		System.out.println(this.fecha.toString());
	}


}

