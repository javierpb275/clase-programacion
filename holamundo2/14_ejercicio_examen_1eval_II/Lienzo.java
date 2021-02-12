public abstract class Lienzo{
	char[][] tablero;
	char[][] almacen1;
	char[][] almacen2;

	final int TAMANO = 9;
	final char BLANCO = ' ';

	public Lienzo(){
		inicializar();
	}

	void inicializar(){
		tablero = new char[TAMANO][TAMANO];
		for (int i = 0; i < TAMANO ; i++) {
			for (int j=0; j < TAMANO ; j++) {
				tablero[i][j] = BLANCO;
			}
		}

		almacen1 = new char[TAMANO][TAMANO];
		for (int i = 0; i < TAMANO ; i++) {
			for (int j=0; j < TAMANO ; j++) {
				almacen1[i][j] = BLANCO;
			}
		}

		almacen2 = new char[TAMANO][TAMANO];
		for (int i = 0; i < TAMANO ; i++) {
			for (int j=0; j < TAMANO ; j++) {
				almacen2[i][j] = BLANCO;
			}
		}		

	}
	
	public void mostrar(){
		for (int i = 0; i < TAMANO ; i++) {
			for (int j=0; j < TAMANO ; j++) {
				if (j>0) System.out.print(BLANCO);
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}	
	}

	public abstract void interactua();

}
