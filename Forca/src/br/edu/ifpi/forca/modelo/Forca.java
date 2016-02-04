package br.edu.ifpi.forca.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forca {
	private static Forca forca;
	private static List<Palavras> bancoDePalavras=new ArrayList<Palavras>();
	private Forca(){}
	private Rodada nova;
	
	public static Forca getInstance(){
		if(forca==null){
			forca = new Forca();
			forca.addPalavra("CAPIVARA", "ANIMAL");
			forca.addPalavra("JUMENTO", "ANIMAL");
			forca.addPalavra("CARRAPATO", "ANIMAL");
			forca.addPalavra("FEIJAO", "ALIMENTO");
			forca.addPalavra("MILHO", "ALIMENTO");
			forca.addPalavra("ARROZ", "ALIMENTO");
			forca.addPalavra("MOTO", "TRANSPORTE");
			forca.addPalavra("TREM","TRANSPORTE");
			forca.addPalavra("ONIBUS","TRANSPORTE");
			forca.addPalavra("WALMART","COMERCIO");
			forca.addPalavra("CARVALHO","COMERCIO");
			forca.addPalavra("MERCADOLIVRE", "COMERCIO");
			
		}
		return forca;
	}
	public void novaRodada(String nome){
		nova=new Rodada(nome);
	}
	public void addPalavra(String palavra,String tema){
		bancoDePalavras.add(new Palavras(palavra,tema));
	}
	public Palavras sorteioPalavra(){
		Random rand=new Random();
		return bancoDePalavras.get(rand.nextInt(bancoDePalavras.size()));
	}
	
	public void mostrarBanco(){
		for (Palavras palavras : bancoDePalavras) {
				System.out.println(palavras.toString());
		}
	}
	public Rodada getRodada(){
		return this.nova;
	}
	

}
