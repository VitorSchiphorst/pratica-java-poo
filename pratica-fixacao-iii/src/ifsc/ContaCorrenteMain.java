package ifsc;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ContaCorrente Conta = new ContaCorrente();
		Double valor = 0.0;
		
		Conta.nomeTitular = "Vitor Hugo Schiphorst";
		Conta.cpf = 124532355l;
		Conta.numeroConta = 346367574l;
		Conta.saldo = 1000.0;
		
		System.out.println("Você deseja:");
		System.out.println("[1] Sacar");
		System.out.println("[2] Depositar");
		System.out.println("[3] Mostrar Dados da Conta");
		
		Integer painel = Integer.valueOf(ler.nextLine());
		
		if (painel == 1) {
			Conta.Sacar(50.0);
		}
		
		else if(painel == 2) {
			Conta.Depositar(300.0);
		}
		
		else if(painel == 3) {
			Conta.Dados();
		}
	}
}
