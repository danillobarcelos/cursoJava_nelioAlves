package exercicio03.entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String finalResult() {
		if (finalGrade() >= 60) {
		return "FINAL GRADE: " + String.format("%.2f", finalGrade()) + "\nPASS";
		} else {
			double missing = 60 - finalGrade();
		return "FINAL GRADE: " 
					+ String.format("%.2f", finalGrade())
					+ "\nFAILED" 
					+ "\nMISSING " + String.format("%.2f", missing) 
					+ " POINTS";}
	}
} 
