package br.com.poo.modelo;

public class Local {
	
	private String endereço;
	private String capacidade;
	
	public Local(String endereço, String capacidade) {
		this.endereço = endereço;
		this.capacidade = capacidade;

}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
}
