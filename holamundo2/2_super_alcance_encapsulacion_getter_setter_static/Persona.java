public class Persona {

	protected String nombre;
	private String dni;

	public static String info;

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private String getDatos() {
		return nombre + " " + dni;
	}


	@Override
	public String toString() {
		return getDatos();
	}

}
