public interface Dibujable {
	
	public void dibuja(int x, int y);  

	public void borra(int x, int y); 

	public void guarda(int almacen);

	public void recupera(int almacen);

	public void ejecutaComando(String comando) 
		throws CoordenadaIncorrecta, ComandoIncorrecto, AlmacenIncorrecto;

}
