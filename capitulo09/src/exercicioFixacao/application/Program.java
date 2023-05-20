package exercicioFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exercicioFixacao.entities.Account;

public class Program {
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, holder, balance);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println("Account Data:" +account);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("\nUpdate account data: "+account);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Update account data: "+account);
		
		
		sc.close();
	}

}
