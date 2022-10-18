package ifsc;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalMain {

	public static void main(String[] args) {
		
		ArrayList<Gato> gatos = new ArrayList<>();
		ArrayList<Cachorro> cachorros = new ArrayList<>();
		
		Gato ga1 = new Gato();

		ga1.setNome("Larrys");
		ga1.setPatas(4);
		ga1.setRaca("Siamês");
		ga1.setComp(60.0f);
		ga1.setCor("Preto");
		ga1.setEcos("Casa");
		
		gatos.add(ga1);
		
		Gato ga2 = new Gato();
		
		ga2.setNome("Angel");
		ga2.setPatas(4);
		ga2.setRaca("Angorá");
		ga2.setComp(50.0f);
		ga2.setCor("Branco");
		ga2.setEcos("Apartamento");
		
		gatos.add(ga2);
		
		Gato ga3 = new Gato();
		
		ga3.setNome("Potin");
		ga3.setPatas(4);
		ga3.setRaca("Ragdoll");
		ga3.setComp(55.0f);
		ga3.setCor("Marrom");
		ga3.setEcos("Sítio");
		
		gatos.add(ga3);
		
		Cachorro ca1 = new Cachorro();
		
		ca1.setNome("Bob");
		ca1.setPatas(4);
		ca1.setRaca("Pitbull");
		ca1.setComp(70.0f);
		ca1.setCor("Marrom");
		ca1.setEcos("Apartamento");
		
		cachorros.add(ca1);
		
		Cachorro ca2 = new Cachorro();
		
		ca2.setNome("Red");
		ca2.setPatas(4);
		ca2.setRaca("Doberman");
		ca2.setComp(80.0f);
		ca2.setCor("Preto");
		ca2.setEcos("Casa");
		
		cachorros.add(ca2);
		
		Cachorro ca3 = new Cachorro();
		
		ca3.setNome("Kember");
		ca3.setPatas(4);
		ca3.setRaca("Pasto Alemão");
		ca3.setComp(75.0f);
		ca3.setCor("Marrom com Preto");
		ca3.setEcos("Sítio");
		
		cachorros.add(ca3);
		
		for (Cachorro cachorro : cachorros) {
			
			System.out.println("========CACHORRO========");
			System.out.println("Nome = " + cachorro.getNome());
			System.out.println("Número de Patas = " + cachorro.getPatas());
			System.out.println("Raça = " + cachorro.getRaca());
			System.out.println("Comprimento = " + cachorro.getComp() + "cm");
			System.out.println("Cor = " + cachorro.getCor());
			System.out.println("Ecossistema = " + cachorro.getEcos());
			Cachorro.late();
		}
		
		for (Gato gato : gatos) {
			
			System.out.println("==========GATO==========");
			System.out.println("Nome = " + gato.getNome());
			System.out.println("Número de Patas = " + gato.getPatas());
			System.out.println("Raça = " + gato.getRaca());
			System.out.println("Comprimento = " + gato.getComp() + "cm");
			System.out.println("Cor = " + gato.getCor());
			System.out.println("Ecossistema = " + gato.getEcos());
			Gato.mia();
		}
	}
}
