public abstract class Employee {

	private int monthlySalary;

	public Employee() {
		monthlySalary = 1000;
	}

	public Employee(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public abstract int getYearlySalary();

}
