package br.com.poo.modelo;

public class Local {
	
	private String endere�o;
	private String capacidade;
	
	public Local(String endere�o, String capacidade) {
		this.endere�o = endere�o;
		this.capacidade = capacidade;

}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
}
