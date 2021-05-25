package praticandoOO.br.com.felipe.desafios;

public class TreinandoStrings {
	
	private String valor = "vazio";
	
	
	
	public void setValor(String valor) {
		
		this.valor = valor;
	}
	public String getValor() {
		return valor;
	}
	
	public boolean buscar(String valor) {
		if (this.valor.contains(valor)) return true;
		else return false;
	}
	

	public void adivinheAString(String a) {
		if (a.compareTo(this.valor) == 0) {
			System.out.println("ACERTOU!");
		} else System.out.println("ERROU!");
		
		
		
	}
}
