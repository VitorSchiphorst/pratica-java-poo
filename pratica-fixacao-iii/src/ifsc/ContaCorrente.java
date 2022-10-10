package ifsc;

public class ContaCorrente {

	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;

	public double Sacar(Double valor) {
		
		double retornoSaque = 0;
		if(saldo >= valor) {
			saldo -= valor;
			retornoSaque = valor;
		}
		
		else {
			System.out.println("Saldo insuficiente!!!");
		}
		
		return retornoSaque;
	}

	public void Depositar(Double valor) {
		
		double retornoDeposito = 0;

		saldo += valor;
	}

	public void Dados() {
		System.out.println("Titular = " + nomeTitular);
		System.out.println("CPF = " + cpf);
		System.out.println("Conta = " + numeroConta);
		System.out.println("Saldo = " + saldo);
	}

}
