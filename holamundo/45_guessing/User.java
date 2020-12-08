import java.util.Scanner;

public class User {

	Scanner sc;

	String name;

	public User(String name) {
		this.name = name;
		this.sc = new Scanner(System.in);
	}

	public void guessNumber(int number) {

		int counter = 5;
		int answer;

		do {

			System.out.println("You have " + counter + " opportunities to guess the number");

			System.out.println("Which is the number?");
			answer = sc.nextInt();

			if (answer == number) 
				System.out.println("You have guessed correctly! The number is " + number + ". You Win!");

			else if (answer < number) {
				System.out.println("Wrong answer! Your answer is smaller. It is a bigger number");
				counter--;
			}

			else if (answer > number) {
				System.out.println("Wrong answer! Your answer is bigger. It is a smaller number");
				counter--;
			}

			System.out.println("");

			if (counter <= 0) 
			System.out.println("You have wasted all your opportunities. You Lose!");	

		} while(counter > 0 && answer != number);

	}

}