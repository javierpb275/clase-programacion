import java.util.Scanner;

public class Musico {

	String nombre;
	String apellidos;
	String dir;

	public String getNombreApellidos() {
		return nombre + " " + apellidos;
	}

	public String getNombreApellidos(boolean conDir) {
		return nombre + " " + apellidos;
	}


	@Override
	public String toString() {
		return getNombreApellidos();
	}

}
