package praticandoOO.br.com.felipe.main;

import praticandoOO.br.com.felipe.desafios.TreinandoStrings;

public class Principal {

	public static void main(String[] args) {
		
		TreinandoStrings teste = new TreinandoStrings();
		teste.setValor("obj teste");
		teste.adivinheAString("vazio");
		System.out.println(teste.buscar("obj"));
	}

		

}
