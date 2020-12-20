public class AppCines {

	public static void main(String[] args) {

		//Creo las clases cine para poder probar los metodos de las distintas clases
		//ya que al crear un cine me creara automaticamente filas y butacas
		Cine cine1 = new Cine(10, 20);
		Cine cine2 = new Cine(10, 20);

		//Compruebo que puedo cambiar el estado de una Butaca accediendo a su atributo
		cine1.filas[0].butacas[6].estado = 'I';

		//Compruebo el metodo ocupar de Butaca:
		cine1.filas[0].butacas[0].ocupar();
		cine1.filas[0].butacas[3].ocupar();
		cine1.filas[0].butacas[6].ocupar();

		//Compruebo el metodo liberar de Butaca:
		cine1.filas[0].butacas[0].liberar();
		cine1.filas[0].butacas[6].liberar();

		//Compruebo que puedo acceder a los distintos Cines y ver su estado 
		//gracias a los metodos toString en las distintas clases:
		System.out.println(cine1);
		System.out.println(cine2);

		//Pruebo los metodos que comprueban si una Butaca esta libre, ocupada o inhabilitada
		System.out.println(cine1.filas[0].butacas[0].estaLibre());
		System.out.println(cine1.filas[0].butacas[3].estaInhabilitada());
		System.out.println(cine1.filas[0].butacas[6].estaOcupada());

		//Compruebo el metodo equals de Butaca:
		cine1.filas[0].butacas[10].ocupar();
		System.out.println(cine1.filas[0].butacas[3].equals(cine1.filas[0].butacas[10]));
		System.out.println(cine1.filas[0].butacas[10].equals(cine1.filas[0].butacas[16]));

		//Compruebo el metodo disponible de Fila:
		System.out.println(cine1.filas[0].disponible());

		//Compruebo el metodo disponibleSeguro de Fila:
		System.out.println(cine1.filas[8].disponibleSeguro());

	}

}
