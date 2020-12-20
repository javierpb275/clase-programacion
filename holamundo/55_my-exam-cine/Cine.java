public class Cine {

	Fila[] filas;

	public Cine(int numeroFilas, int butacasPorFila) {
		this.filas = new Fila[numeroFilas];

		for (int i = 0; i < this.filas.length; i++) {
			this.filas[i] = new Fila(butacasPorFila);	
		}

	}

	public String toString() {

		String fila = " ";

		for (int i = 0; i < this.filas.length; i++)
			fila = "Filas: " + this.filas[i];
			
		return fila;

	}

}
