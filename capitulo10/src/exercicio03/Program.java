package exercicio03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas linhas terá a sua matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas terá a sua matriz? ");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Posição: " + i +", " + j);
					if (j > 0) {
						System.out.println("Número a esquerda: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Número acima: " + matriz[i - 1][j]);
					}
					if (j < n - 1) {
						System.out.println("Número a direita: " + matriz[i][j + 1]);
					}
					if(i < m - 1) {
						System.out.println("Número abaixo: " + matriz[i+1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
