public class Mercancia{
	
	private String nombre;

	private int precio;

	public Mercancia(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String toString() {
		return " " + this.nombre + " " + this.precio;
	}

}