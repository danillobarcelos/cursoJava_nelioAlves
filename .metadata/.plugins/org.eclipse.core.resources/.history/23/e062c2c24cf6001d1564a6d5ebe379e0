package exercicio03.application;

import java.util.Locale;
import java.util.Scanner;

import exercicio03.entities.Student;

public class Program {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("NAME: ");
		student.name = sc.nextLine();
		System.out.println("GRADES: ");
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println(student.finalResult());
		
	}
}
