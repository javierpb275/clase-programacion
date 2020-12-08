public class Guessing {

	public static void main(String[] args) {

		Machine machine = new Machine("XP-8000");

		User user = new User("Pepe");

		int randomNum = machine.randomNumberBetween(1, 100);

		user.guessNumber(randomNum);

	}

}