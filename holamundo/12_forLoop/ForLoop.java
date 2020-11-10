public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("---------------");

		for (int i = 0; i < 10; i++) {
			System.out.println(i*2);
		}

		//--------------------

		//Infinite loop:

		/*

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			i = 8;
		}

		This would print 9 forever.

		*/

	}

}