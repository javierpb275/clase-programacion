import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		//int[] box;

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("Write the value of 'a':");
		int a = sc.nextInt();

		System.out.println("");

		System.out.println("Write the value of 'b':");
		int b = sc.nextInt();

		System.out.println("");

		int box[] = new int[2];

		box[0] = a;
		box[1] = b;

		for (int i = 0; i < box.length; i++) {

			System.out.println(box[i]);

		}

	}

}