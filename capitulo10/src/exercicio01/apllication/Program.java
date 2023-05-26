package exercicio01.apllication;

import java.util.Locale;
import java.util.Scanner;

import exercicio01.entitites.Bedrooms;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Bedrooms[] cadastro = new Bedrooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
						
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			cadastro[room] = new Bedrooms(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10 ; i++) {
			if(cadastro[i] != null) {
				System.out.println(i + ": " + cadastro[i]);
			}
			
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
