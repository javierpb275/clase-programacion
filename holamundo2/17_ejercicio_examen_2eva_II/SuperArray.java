public class SuperArray implements Manipulable {
	
	private int[][] miArray;

	public SuperArray(int[][] miArray) {
		super();
		this.miArray = miArray;

	}
	
	
	public SuperArray() {
		super();
		inicializar();
		
	}
	
	private void inicializar() {
		
		int p = (int) (Math.random() * ((9 + 1) - 0)) + 0;
		
		this.miArray = new int[p][p];
		
		for (int i = 0; i < this.miArray.length; i++) {
			for (int j = 0; j < this.miArray[0].length; j++) {
				
				int n = (int) (Math.random() * ((9 + 1) - 0)) + 0;
				
				this.miArray[i][j] = n;
				
			}
		}
	}
	
	public void mostrar() {
		for (int i = 0; i < this.miArray.length; i++) {
			for (int j = 0; j < this.miArray[0].length; j++) {
				
			if (j > 0) 
				System.out.print(" ");
				System.out.print(miArray[i][j]);
			}
			
			System.out.println();
		}	
	}

	private boolean sePuedeRestarUno() {
		
        boolean resultado = true;
        
        int contador = 0;
        
        for (int f=0;f<miArray.length ;f++ ) {
         for (int c = 0;c < miArray[0].length ;c++ ) {
            	 
             if(miArray[f][c] <= 0) 
            	 contador ++;

             if(contador > 0 ) 
            	 resultado = false;
          
             }
         }

        return resultado;
    }



	@Override
	public void aumentarUno() {
		for(int i = 0; i < miArray.length; i++) {
			for(int j = 0; j < miArray[0].length; j++) {
				this.miArray[i][j] += 1;
			}
		}

	}

	@Override
	public void restarUno() throws NoSePuedeRestar {
		
		if(!sePuedeRestarUno())
			throw new NoSePuedeRestar();
		
		for(int i = 0; i < miArray.length; i++) {
			for(int j = 0; j < miArray[0].length; j++) {
				this.miArray[i][j] -= 1;
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


	public int[][] getMiArray() {
		return miArray;
	}


	public void setMiArray(int[][] miArray) {
		this.miArray = miArray;
	}	

}
