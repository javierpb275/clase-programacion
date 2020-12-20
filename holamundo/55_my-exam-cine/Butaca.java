public class Butaca {

	char estado;
	int contadorLiberar;

	public Butaca() {
		this.estado = 'L';
		this.contadorLiberar = 0;

		if (this.contadorLiberar == 3)
			this.estado = 'I';

	}

	//Este metodo cambia el estado de una butaca a "Ocupada" ('O') a no ser que este "Inhabilitada"
	public void ocupar() {
		if (this.estado == 'I')
			System.out.println("Esta butaca esta inhabilitada");
		else if (this.estado == 'O')
			System.out.println("Esta butaca ya esta ocupada");
		else
		this.estado = 'O';
	}

	//Este metodo cambia el estado de una butaca a "Libre" ('L') a no ser que este "Inhabilitada"
	public void liberar() {
		if (this.estado == 'I')
			System.out.println("Esta butaca esta inhabilitada");
		else if (this.estado == 'L')
			System.out.println("Esta butaca ya esta libre");
		else {
			this.estado = 'L';
			contadorLiberar++;
		}
		
	}

	//Este metodo comprueba si una butaca esta "Ocupada" o no.
	public boolean estaOcupada() {
		return (this.estado == 'O') ? true : false;
	}

	//Este metodo comprueba si una butaca esta "Libre" o no.
	public boolean estaLibre() {
		return (this.estado == 'L') ? true : false;
	}

	//Este metodo comprueba si una butaca esta "Inhabilitada" o no.
	public boolean estaInhabilitada() {
		return (this.estado == 'I') ? true : false;
	}

	//Este metodo compara una butaca con otra.
	public boolean equals(Butaca b) {
		return (this.estado == b.estado) ? true : false;
	}

	public String toString() {
		return "Estado: " + this.estado;
	}



}
