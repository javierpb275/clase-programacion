public class Calculadora implements Resolvible {

	private String expresion;

	public Calculadora() {
		expresion = "";
	}

	public Calculadora(String expresion) {
		this.expresion = expresion;

	}

	private boolean esDigitoEntero(char digito) {
		//char[] lista = {'a', 'b', 'j', 'n'};
		/*
		String lista = "0123456789";
		boolean result = false;
		for (int i = 0; i < lista.length(); i++) {
			if(lista.charAt(i)==digito)
				result = true;
			
		}
		return result;
		*/
		return ((digito >= '0') && (digito <= '9'));
	}

	private boolean esOperadorValido(char digito) {
		return ((digito == '-') && (digito == '+') && (digito == '*'));
	}

	private int calcula(Operador operador, int operando1, int operando2) {

		int result;

		switch(operador) {
			case SUMAR:
			result = operando1 + operando2;
			break;
			case RESTAR:
			result = operando1 - operando2;
			break;
			case MULTIPLICAR:
			result = operando1 + operando2;
			break;
			default:
			result = 0;
		}

		return result;

	}


	public boolean expresionEsCorrecta(String expresion) {

			boolean result = true;
			char charAtLastPosition = expresion.charAt(expresion.length() - 1);
			boolean lastCharEsDigito = esDigitoEntero(charAtLastPosition);

			if (expresion.length() < 3)
				result = false;
			else if (!lastCharEsDigito)
				result = false;
			else {
				for (int i = 0; i < expresion.length(); i++) {
					if (i % 2 == 0 && !esDigitoEntero(expresion.charAt(i)))
						result = false;
					if (i % 2 != 0 && !esOperadorValido(expresion.charAt(i)))
						result = false;
				}
			}

			return result;

		}

	public int getResultado() 
		throws ExpresionIncorrecta, ExpresionMuyLarga, ExpresionVacia {

			if(!expresionEsCorrecta(this.expresion))
				throw new ExpresionIncorrecta();
			if(this.expresion.length() > 30)
				throw new ExpresionMuyLarga();
			if(this.expresion == null || this.expresion.length() == 0)
				throw new ExpresionVacia();

			int result = 0;

			return result;
		}

	public String getExpresion() {
		return this.expresion;
	}

	public void setExpresion(String expresion) {
		this.expresion = expresion;
	}

}

