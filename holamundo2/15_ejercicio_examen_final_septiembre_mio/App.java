import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Itinerario itinerario = new Itinerario();

		addNodoItinerario(itinerario);

		mostrarNodosItinerarioCambiarEstado(itinerario);
		
	}

	public static void addNodoItinerario(Itinerario itinerario) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime nombre mercancia:");
		String nombre = sc.nextLine();
		System.out.println("Dime precio mercancia:");
		int precio = sc.nextInt();

		Mercancia mercancia = new Mercancia(nombre, precio);

		sc.nextLine();//para comerse el Enter del entero

		System.out.println("Dime nombre del Titular de la vivienda:");
		String nombreTitular = sc.nextLine();
		System.out.println("Dime direccion de la vivienda:");
		String direccion = sc.nextLine();

		Vivienda vivienda = new Vivienda(nombreTitular, direccion);

		Nodo nodo = new Nodo(vivienda, mercancia);

		try {
			itinerario.addNodo(nodo);
		} catch(ItinerarioLleno e) {
			System.out.println("Itinerario Lleno");
		}

	}

	public static void mostrarNodosItinerarioCambiarEstado(Itinerario itinerario) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < itinerario.getContador(); i++) {
			itinerario.muestraNodo(i);
		}

		System.out.println("Dime el nodo que quieres modificar:");
		int numNodo = sc.nextInt();

		sc.nextLine();//para comerse el Enter del entero

		System.out.println("Dime el Estado del nodo:");
		System.out.println("1. AUSENTE");
		System.out.println("2. ENTREGADO");
		int estado = sc.nextInt();

		switch(estado) {
			case 1:
			itinerario.modificaEstadoNodo(numNodo, Estado.AUSENTE);
			break;
			case 2:
			itinerario.modificaEstadoNodo(numNodo, Estado.ENTREGADO);
			break;
		}

		for (int i = 0; i < itinerario.getContador(); i++) {
			itinerario.muestraNodo(i);
		}

	}
}