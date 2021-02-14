public class Vivienda {
	
	private String nombreTitular;
	private String direccion;

	public Vivienda(String nombreTitular, String direccion) {
		this.nombreTitular = nombreTitular;
		this.direccion = direccion;
	}

	public String getNombreTitular() {
		return this.nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String toString() {
		return " " + this.nombreTitular + " " + this.direccion;
	}
}