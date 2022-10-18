package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Aluno a = new Aluno();
		Professor pr = new Professor();
		
		p.setNome("Vitor Hugo Schiphorst");
		p.setCpf("204367686");	
		a.setMatricula(325236);
		pr.setSiape(24658);
		
		System.out.println("Nome = " + p.getNome());
		System.out.println("CPF =  " + p.getCpf());
		System.out.println("Siape = " + pr.getSiape());
		System.out.println("Matrícula = " + a.getMatricula());
		
	}

}