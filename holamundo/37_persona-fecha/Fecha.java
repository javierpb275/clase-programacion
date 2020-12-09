public class Fecha {
	int ano;
	int mes;
	int dia;

	public Fecha() {

		ano = 2020;
		mes = 11;
		dia = 30;

	}

	public Fecha(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	public String toString() {

		return "" + dia + "/" + mes + "/" + ano;

	}

	public boolean equals(Fecha f) {

		return (this.dia == f.dia && this.mes == f.mes && this.ano == f.ano);

	}

}
