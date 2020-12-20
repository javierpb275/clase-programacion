public class Complejo {

	double pReal;
	double pImg;
	double valor;

	public Complejo(double pReal, double pImg) {
		this.pReal = pReal;
		this.pImg = pImg;
	}

	public Complejo() {
		this.pReal = 0.0;
		this.pImg = 0.0;
	}

	public void asignar(double pReal, double pImg) {
		this.pReal = pReal;
		this.pImg = pImg;
	}

	public void sumar() {
		this.valor = this.pReal + this.pImg;
	}

	public boolean equals(Complejo c) {
		return this.valor == c.valor;
	}

	public String toString() {
		return "pReal: " + pReal + ", pImg: " + pImg + ", numero: " + valor;
	}

}
