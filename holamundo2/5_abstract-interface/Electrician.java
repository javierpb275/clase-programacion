public class Electrician extends Employee {

	String title;

	public Electrician(String title, int monthlySalary) {
		super(monthlySalary);

		this.title = title;

	}

	@Override
	public int getYearlySalary() {
		return getMonthlySalary() * 13;
	}

}
