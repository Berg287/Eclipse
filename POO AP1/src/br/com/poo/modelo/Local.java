package br.com.poo.modelo;

public class Local {
	
	private String enderešo;
	private String capacidade;
	
	public Local(String enderešo, String capacidade) {
		this.enderešo = enderešo;
		this.capacidade = capacidade;

}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
}
