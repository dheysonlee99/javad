package br.edu.ifpi.forca.modelo;

import java.util.HashSet;
import java.util.Set;

public class Rodada {
	public static final int PERDEU = -1;

	public static final int GANHOU = 1;

	public static final int JOGANDO = 0;
	
	private String nomeJogador;
	private int status = JOGANDO;
	private final int vida = 6;
	private Palavras palavraTema;
	private Set<Character> letra = new HashSet<>();
	private Set<Character> letrasErradas = new HashSet<>();
	private Set<Character> letrasCertas = new HashSet<>();
	
	public Rodada(String nomeJogador){
		this.setNomeJogador(nomeJogador);
		this.palavraTema = Forca.getInstance().sorteioPalavra();
		for (char i : this.palavraTema.getNome().toCharArray()) {
			this.letra.add(i);
		}
	}
	public Palavras getPalavras(){
		return this.palavraTema;
	}
	
	public Set<Character> getLetrasCertas(){
		return letrasCertas;
	}
	public Set<Character> getLetrasErradas(){
		return letrasErradas;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}
	public String exibirErradas(){
		String Erradas = "";
		for (Character character : letrasErradas) {
			Erradas+=character+" ";
		}
		return Erradas;
	}

	
	public String exibirCertas(){
		String Certas = "";
		for (Character character : letrasCertas) {
			Certas+=character+" ";
		}
		return Certas;
	}

	
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	
	public boolean testaLetra(char letraunica){
		if(this.letra.contains(letraunica)){
			this.letrasCertas.add(letraunica);
			if(this.letrasCertas.containsAll(letra)){
				this.setStatus(GANHOU);
			}
			return true;
		}else{
			this.letrasErradas.add(letraunica);
			if(this.letrasErradas.size() == vida){
				this.setStatus(PERDEU);
			}
			return false;
		}
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
