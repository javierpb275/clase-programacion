public class AppBank {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();

		account1.deposit(100);

		account1.withDraw(50);

		account1.transfer(25, account2);

		System.out.println(account2);

	}

}