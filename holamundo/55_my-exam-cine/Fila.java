public class Fila {

	Butaca[] butacas;

	public Fila(int numeroButacas) {
		this.butacas = new Butaca[numeroButacas];

		for (int i = 0; i < this.butacas.length; i++) {
			this.butacas[i] = new Butaca();	
		}
	}

	//Este metodo comprueba si hay alguna butaca libre en la fila.
	public boolean disponible() {

		boolean disponible = false;
		int contador = 0;

		do {

			if (this.butacas[contador].estado == 'L') 
				disponible = true;
			else
				disponible = false;

			contador++;

		} while(!disponible && contador < this.butacas.length);

		if(disponible)
			System.out.println("Esta disponible.");
		else
			System.out.println("No esta disponible.");

		return disponible;
	}

	//Este metodo comprueba si hay alguna butaca libre en la fila y si es segura.
	//Segura: no esta ocupada la butaca de al lado.
	public boolean disponibleSeguro() {

		boolean disponible = false;
		int contador = 0;

		do {

			if (this.butacas[contador].estado == 'L' && this.butacas[contador+1].estado != 'O') 
				disponible = true;
			else
				disponible = false;

			contador++;

		} while(!disponible && contador < this.butacas.length - 1);

		if(disponible)
			System.out.println("Esta disponible y es segura.");
		else
			System.out.println("No esta disponible.");

		return disponible;
	}
	
	public String toString() {

		String butaca = " ";

		for (int i = 0; i < this.butacas.length; i++)
			butaca = "Butacas " + this.butacas[i];
			
		return butaca;

	}

}
