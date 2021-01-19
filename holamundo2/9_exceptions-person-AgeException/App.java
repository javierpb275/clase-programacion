import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person people[] = new Person[10];

		int i = 0;

		String name;
		int age;
		boolean error;

		do {

			try {

			error = false;
			//people[i] = new Person();
			System.out.println("Tell me your name:");
			name = sc.nextLine();
			System.out.println("How old are you ?");
			age = sc.nextInt();

			sc.nextLine();//para comerse el Enter del entero

			//people[i].setName(name);

			//people[i].setAge(age);

			people[i] = new Person(name, age);
			

			} catch(AgeException e) {
				error = true;
				System.out.println(e);
			} finally {

			}

			if (!error) {
				i++;
				System.out.println("Person added");
			} 

		} while(i < 10);

	}

}
