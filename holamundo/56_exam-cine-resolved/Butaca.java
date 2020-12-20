public class Butaca{
	char estado; //O,L,I
	int contador;

	Butaca(){
		estado = 'L';
		contador =0;
	}

	public void ocupar(){
		if (estado == 'L') estado = 'O';
	}
	public void liberar(){

		if (estado == 'O'){
			if (contador ==3){
				estado = 'I';
			} else{
				contador++;
				estado = 'L';
			}	
		} 
	}

	public boolean estaOcupado(){
		return estado=='O';
	}
	public boolean estaLibre(){
		return estado=='L';
	}

	public boolean estaInhabilitado(){
		return estado=='I';
	}

	public boolean equals(Butaca b){
		return estado==b.estado &&
			contador == b.contador; 
	}

	public String toString(){
		String resultado;
		switch(estado){
			case 'O' :
					resultado = "Ocupada";
					break;
			case 'L' :
					resultado = "Libre";
					break;
			default :
					resultado = "Inhabilitada";
					break;				
		}


		return resultado;
	}


}
