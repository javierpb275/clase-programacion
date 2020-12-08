public class BankAccount {

	int quantity;

	public BankAccount() {
		this.quantity = 0;
	}

	public void deposit(int money) {

		this.quantity += money;

		System.out.println("Deposit successful");

		System.out.println("You have $" + this.quantity + " in your account");

	}

	public void withDraw(int money) {

		this.quantity -= money;

		System.out.println("Withdrawal successful");

		System.out.println("You have $" + this.quantity + " in your account");

	}

	public void transfer(int money, BankAccount account) { 

		this.quantity -= money;

		account.quantity += money;

	}

	public String toString() {
		return "" + quantity;
	}

}