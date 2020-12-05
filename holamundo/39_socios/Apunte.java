public class Apunte {

	int importe;
	boolean ingreso;
	String concepto;
	String fecha;

	public Apunte(int importe, boolean ingreso, String concepto, String fecha) {
		this.importe = importe;
		this.ingreso = ingreso;
		this.concepto = concepto;
		this.fecha = fecha;
	}

	public boolean equals(Apunte a) {

		return (this.concepto.equals(a.concepto) && this.fecha.equals(a.fecha) 
			&& this.importe == a.importe && this.ingreso == a.ingreso);

	}

	public String toString() {

		String ig = ingreso ? "I" : "G";

		return "Fecha: " + fecha + ", Concepto: " + concepto + 
		", Importe: " + importe + " " + ig;

	}

}
