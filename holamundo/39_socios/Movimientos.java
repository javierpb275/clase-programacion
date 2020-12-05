public class Movimientos {

	Apunte[] listaApuntes;
	int contador;

	public Movimientos() {
		this.listaApuntes = new Apunte[200];
		this.contador = 0;
		}

	public void push(Apunte a) {

		listaApuntes[contador] = a;

		contador++;

		}

	public Apunte pop() {

		Apunte resultado = listaApuntes[contador-1];

		listaApuntes[contador-1] = null;

		contador--;

		return resultado;

		}

	public int totalApuntes() {

		int total = 0;

		for (int i = 0; i < contador; i++) {

			if (listaApuntes[i].ingreso) 
				total += listaApuntes[i].importe;
			
			else 
				total -= listaApuntes[i].importe;
			
		}

		return total;

	}

	public void mostrar() {

		for (int i = 0; i < contador; i++) {

			System.out.println(listaApuntes[i]);
			
		}

	}

}
