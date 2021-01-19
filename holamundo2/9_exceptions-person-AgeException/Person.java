public class Person {

	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) throws AgeException {
		this.name = name;
		
		if (age >= 18)
			this.age = age;
		else
			throw new AgeException("Must be over 18");

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) throws AgeException {
		if (age >= 18)
			this.age = age;
		else
			throw new AgeException("Must be over 18");
	}

}
