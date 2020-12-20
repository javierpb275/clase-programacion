public class Bombilla {

	boolean encendida;

	public Bombilla() {
		this.encendida = false;
	}

	public Bombilla(boolean encendida) {
		this.encendida = encendida;
	}

	public void on() {
		this.encendida = true;
	}

	public void off() {
		this.encendida = false;
	}

	public boolean equals(Bombilla b) {
		return this.encendida == b.encendida;
	}

	public String toString() {
		return this.encendida ? "on" : "off";
	}
}
