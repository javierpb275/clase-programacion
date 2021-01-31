public interface Manipulable {
	
	public void aumentarUno();

	public void restarUno() throws NoSePuedeRestar; 

	public void intercambia(int fila1,int fila2); 

	public void ponMenorACero();
	
}
