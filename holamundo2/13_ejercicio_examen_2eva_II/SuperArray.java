public class SuperArray implements Manipulable {

	private int[][] miArray;

	public SuperArray() {

	}

	public SuperArray(int[][] miArray) {
		this.miArray = miArray;
	}

	@Override
	public void aumentarUno() {
		for (int x = 0; x < this.miArray.length; x++) {
			for (int y = 0; y < this.miArray[x].length; y++) {
				this.miArray[x][y] += 1;
			}
		}
	}

	@Override
	public void restarUno() throws NoSePuedeRestar {

		if(!sePuedeRestarUno())
			throw new NoSePuedeRestar();

		for (int x = 0; x < this.miArray.length; x++) {
			for (int y = 0; y < this.miArray[x].length; y++) {
					this.miArray[x][y] -= 1;
			}
		}
	} 

	@Override
	public void intercambia(int fila1, int fila2) {
		int aux;
		for (int c = 0; c < this.miArray[0].length; c++) {
			aux = miArray[fila1][c];
			miArray[fila1][c] = miArray[fila2][c];
			miArray[fila2][c] = aux;		
		}
	}

	@Override
	public void ponMenorACero() {

		// suponemos que ambos están en la primer posición
		int mayor = this.miArray[0][0];
		int menor = this.miArray[0][0]; 

		// Recorremos la matriz
		for (int x = 0; x < this.miArray.length; x++) {
			for (int y = 0; y < this.miArray[x].length; y++) {

				int numeroActual = this.miArray[x][y];

				if (numeroActual > mayor)
					mayor = numeroActual;

				if (numeroActual < menor)
					menor = numeroActual;
				
			}

		}

		for (int x = 0; x < this.miArray.length; x++) {
			for (int y = 0; y < this.miArray[x].length; y++) {

				if (this.miArray[x][y] == menor)
					this.miArray[x][y] = 0;
			}
		}
	}

	private boolean sePuedeRestarUno() {
		boolean result = true;
		for (int x = 0; x < this.miArray.length; x++) {
			for (int y = 0; y < this.miArray[x].length; y++) {
				if (this.miArray[x][y] == 0)
					result = false;
			}
		}
		return result;
	}

	public int[][] getMiArray() {
		return this.miArray;
	}

	public void setMiArray(int[][] miArray) {
		this.miArray = miArray;
	}

}
