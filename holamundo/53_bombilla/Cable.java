public class Cable {

	Bombilla[] tira;

	public Cable() {
		this.tira = new Bombilla[100];

		for (int i = 0; i < tira.length; i++) {
			this.tira[i] = new Bombilla();	
		}
	}

	public void onOff(int numBombilla, boolean valor) {
		this.tira[numBombilla].encendida = valor;

	}

	public void alternar() {
		for (int i = 0; i < tira.length; i++) {

			if(i%2 == 0) 
				tira[i].on();
			else
				tira[i].off();
		}
	}

	public int binario() {

		int[] mult = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

		int resultado = 0;

		for (int i = 0; i < 10; i++) {

			if(tira[i].encendida)
				resultado += mult[i];

		}

		return resultado;

	}
}
