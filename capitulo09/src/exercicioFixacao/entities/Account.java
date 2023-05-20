package exercicioFixacao.entities;

public class Account {
	private static int number;
	private String holder;
	private double balance;
	private static final int TAX = 5;
	
	public Account() {
	}
	
	public Account(int number, String holder, double balance) {
		Account.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(int number, String holder) {
		Account.number = number;
		this.holder = holder;
	}

	public static int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		 this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + TAX;
	}
	
	public String toString() {
		return 	"\nAccount "
				+ Account.number 
				+ ", Holder: "
				+ getHolder()
				+ ", Balance: "
				+ getBalance();
	}

}
