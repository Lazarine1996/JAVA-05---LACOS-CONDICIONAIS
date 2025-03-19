package atividadejava05;

import java.util.Scanner;

public class AtividadeIf1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite o número A: ");
		int A = scanner.nextInt();
		
		System.out.print("Digite o número B: ");
		int B = scanner.nextInt();
		
		System.out.print("Digite o número C: ");
		int C = scanner.nextInt();
		
		if ((A + B)> C) {
			System.out.printf("A soma de A + B é Maior que C" , A, B, C);
		
		}else if (A + B < C) {
			System.out.printf("A soma de A + B é Menor que C" , A, B, C);
		
		}else {
			System.out.printf("A soma de A + B é igual a C" , A, B, C);
		}
		
		scanner.close();
	}

}
