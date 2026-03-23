package nonStaticInnerClass;

public class Bank {
	private double balance = 1000.0;
	
	public void showBalance() {
		System.out.println(balance);
	}

	public class Account {
		public void deposite(double amount) {
			Bank.this.balance += amount;
		}
	}
	public static void main(String[] args) {
		Bank b = new Bank();
		Account a = b.new Account();
		a.deposite(1000.0);
		b.showBalance();
		a.deposite(500.0);
		b.showBalance();
	}

}
