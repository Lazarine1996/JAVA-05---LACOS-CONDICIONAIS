package atividadejava05;

import java.util.Scanner;

public class AtividadeSwitch8 {

	public static void main(String[] args) {
		String nomeOperacao;
		Scanner scanner = new Scanner(System.in);
		int operacao;
		float valor = 1000.00f;
		float valorSaque = 0.0f;
		float valorDeposito = 0.0f;

		System.out.println("Digite a operação desejada: ");
		operacao = scanner.nextInt();
		switch (operacao) {

		case 1: {
			nomeOperacao = "Saldo";
			System.out.printf("Operação - %s\nSaldo: %.2f", nomeOperacao, valor);
			break;

		}
		case 2: {
			nomeOperacao = "Saque";
			System.out.println("Digite o valor de Saque: ");
			valorSaque = scanner.nextFloat();
			if (valorSaque > valor) {
				System.out.printf(" Operação - %s\nSaldo Insuficiente", nomeOperacao);
				valor = valor - valorSaque;

			} else {
				valor = valor - valorSaque;
				System.out.printf(" Operação - %s\nSaldo %.2f ", nomeOperacao, valor);

			}
			break;

		}
		case 3: {
			nomeOperacao = "Depósito";
			System.out.println("Digite o valor de Deposito: ");
			valorDeposito = scanner.nextFloat();
			valor = valor + valorDeposito;
			System.out.printf("Operação - %s\\nSaldo: %.2f", nomeOperacao, valor);

			break;
		}

		default:
			System.out.print("Operação Invalida");

		}

		scanner.close();

	}
}
