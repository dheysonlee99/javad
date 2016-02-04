package br.edu.ifpi.forca.modelo;

public class Palavras {
	private String Tema;
	private String nome;
	
	public Palavras(String Tema, String nome){
		this.setTema(Tema);
		this.setNome(nome);
	}

	public String getTema() {
		return Tema;
	}

	public void setTema(String tema) {
		Tema = tema;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
