import java.util.Random; 

public class Machine {
	
	Random random; 

	String name;

	public Machine(String name) {
		this.name = name;
		this.random = new Random();

	}

	public int randomNumberBetween(int min, int max) {

		int randomNum = random.nextInt((max - min) + 1) + min;

		return randomNum;

	}


}