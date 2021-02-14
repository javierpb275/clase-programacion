import java.util.Scanner;

public class LienzoDibujable extends Lienzo implements Dibujable {

	private final String DIBUJA = "DIBUJA";
	private final String BORRA = "BORRA";
	private final String GUARDA = "GUARDA";
	private final String RECUPERA = "RECUPERA";
	private final String FIN = "FIN";
	private final char MARCA = '*';


	@Override
	public void dibuja(int x, int y) {
		tablero[x][y] = MARCA;
	}

	@Override
 	public void borra(int x, int y) {
 		tablero[x][y] = BLANCO;
 	}

 	@Override
 	public void guarda(int almacen) {

 		 for (int f=0;f<tablero.length ;f++ ) {

         for (int c=0;c<tablero[0].length ;c++ ) {
              if (almacen == 1) {
                almacen1[f][c] = tablero[f][c];
              } else if (almacen == 2){
                 almacen2[f][c] = tablero[f][c];
              }

             }

        }

 	}

 	@Override
 	public void recupera(int almacen) {

 		for (int f=0;f<tablero.length ;f++ ) {

          for (int c=0;c<tablero[0].length ;c++ ) {
               if (almacen == 1) {
                  tablero[f][c] = almacen1[f][c];
              	} else if (almacen == 2){
                    tablero[f][c] = almacen2[f][c];
                }

            }

        }
 	}

 	private String obtenerOrden(String comando) {
	String resultado = "";
	if (comando.indexOf(DIBUJA)==0)
		resultado = DIBUJA;
	else if (comando.indexOf(BORRA)==0)
		resultado = BORRA;
	else if (comando.indexOf(GUARDA)==0)
		resultado = GUARDA;
	else if (comando.indexOf(RECUPERA)==0)
		resultado = RECUPERA;

	return resultado;

	}

	private int obtenerCoordenada1(String comando){
	int resultado = -1;
	String c1;
	String orden = obtenerOrden(comando);

	if (orden.equals(DIBUJA)&&
		comando.length()==10){
		c1 = "" + comando.charAt(7);
		try{
			resultado = Integer.parseInt(c1);
		} catch(NumberFormatException e){}
	} else if (orden.equals(BORRA)&&
		comando.length()==9){
		c1 = "" + comando.charAt(6);
		try{
			resultado = Integer.parseInt(c1);
		} catch(NumberFormatException e){}
	} else if (orden.equals(GUARDA)&&
		comando.length()==8){
		c1 = "" + comando.charAt(7);
		try{
			resultado = Integer.parseInt(c1);
		} catch(NumberFormatException e){}
	} else if (orden.equals(RECUPERA)&&
		comando.length()==10){
		c1 = "" + comando.charAt(9);
		try{
			resultado = Integer.parseInt(c1);
		} catch(NumberFormatException e){}
	} 
		
	return resultado;	

	}

	private int obtenerCoordenada2(String comando){
	int resultado = -1;
	String c2;
	String orden = obtenerOrden(comando);

	if (orden.equals(DIBUJA)&&
		comando.length()==10){
		c2 = "" + comando.charAt(9);
		try{
			resultado = Integer.parseInt(c2);
		} catch(NumberFormatException e){}
	} else if (orden.equals(BORRA)&&
		comando.length()==9){
		c2 = "" + comando.charAt(8);
		try{
			resultado = Integer.parseInt(c2);
		} catch(NumberFormatException e){}
	} 
		
	return resultado;	
}

	private int obtenerCordenada1Elias(String comando){
        int resultado = -1 ;
        char corenada1 ;
        //String orden = obtenerOrden(comando);

        corenada1 = comando.charAt(comando.indexOf(" ")+1); // DIBUJA 2,2

        resultado = Character.getNumericValue(corenada1);
        return resultado;
    }



        private int obtenerCordenada2Elias(String comando){
        int resultado = -1 ;
        char corenada2 ;
        //String orden = obtenerOrden(comando);

        corenada2 = comando.charAt(comando.indexOf(" ")+3);

        resultado = Character.getNumericValue(corenada2) ;
        return resultado;
    }


 	@Override
	public void ejecutaComando(String comando)
		throws CoordenadaIncorrecta, ComandoIncorrecto, AlmacenIncorrecto {

			String orden = obtenerOrden(comando);
			int c1 = obtenerCoordenada1(comando);
			int c2 = obtenerCoordenada2(comando);

			if (orden.equals(""))
				throw new ComandoIncorrecto();

			if (orden.equals(DIBUJA) ||
				orden.equals(BORRA)) {

					if (c1 == -1 || c2 == -1) 
						throw new CoordenadaIncorrecta();
			} else {

				if (c1 == -1) 
					throw new CoordenadaIncorrecta();

				if ((c1 == 0) || (c1 > 2))  
					throw new AlmacenIncorrecto();
			}

		}

	@Override
	public void interactua() {
		Scanner teclado = new Scanner(System.in);
		String comando;
	
		do{
			mostrar();
			System.out.println("Comando: ");
			comando = teclado.nextLine();
		if (!comando.equals(FIN)){
			try{
				ejecutaComando(comando);

			} catch(Exception e){
				System.out.println("Comando incorercto ");
			} 
		}

		} while (!comando.equals(FIN));
	}

}