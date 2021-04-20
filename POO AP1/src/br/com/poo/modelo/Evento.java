package br.com.poo.modelo;

public class Evento {

	private String nome;
	private Data dataEvent;
	private String hora;
	private String artista;
	private Local localEvent;
	private int ingresso;

	public Evento (String nome,Data dataEvent, String hora, String artista, Local localEvent, int ingresso) {
		this.setNome(nome);
		this.setDataEvent(dataEvent);
		this.setHora(hora);
		this.setArtista(artista);
		this.setLocalEvent(localEvent);
		this.setIngresso(ingresso);
	
	}
	
	@override
	public String toString() {
		StringBuilder dados = new StringBuilder();
		
		dados.append(nome);
		dados.append(", dia:");
		dados.append(dataEvent);
		dados.append(" as ");
		dados.append(hora);
		dados.append(", Atrasão Principal: ");
		dados.append(artista);
		dados.append(", Local: ");
		dados.append(localEvent.getEndereço());
		dados.append(", capacidade para ");
		dados.append(localEvent.getCapacidade());
		dados.append(", R$");
		dados.append(ingresso);
		return dados.toString();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataEvent() {
		return dataEvent;
	}

	public void setDataEvent(Data dataEvent) {
		this.dataEvent = dataEvent;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Local getLocalEvent() {
		return localEvent;
	}

	public void setLocalEvent(Local localEvent) {
		this.localEvent = localEvent;
	}

	public int getIngresso() {
		return ingresso;
	}

	public void setIngresso(int ingresso) {
		this.ingresso = ingresso;
	}
	
	
}
