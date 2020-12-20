public class Cine{
	Fila[] filas;

	Cine( int numFilas, int butacasPorFila){
		filas = new Fila[numFilas];
		for (int i=0; i < filas.length ; i++) {
			filas[i] = new Fila(butacasPorFila);
		}
	}


}

