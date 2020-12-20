public class Navidad {

	public static void main(String[] args) {

		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla(true);

		System.out.println(b1);

		System.out.println(b2);

		if (b1.equals(b2)) 
			System.out.println("son iguales");
		else
			System.out.println("no son iguales");
		

	}

}
