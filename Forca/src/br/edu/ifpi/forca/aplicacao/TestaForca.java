package br.edu.ifpi.forca.aplicacao;

import javax.swing.JOptionPane;



import br.edu.ifpi.forca.modelo.Boneco;
import br.edu.ifpi.forca.modelo.Forca;
import br.edu.ifpi.forca.modelo.Palavras;
import br.edu.ifpi.forca.modelo.Rodada;




import java.util.Scanner;


public class TestaForca {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Bem vindo ao jogo da forca");
		
	
		while(true){
			
			String menu = "!\n1 - Jogar\n2 - Adicionar Palavra\n0 - Sair\nOpção escolhida: ";
			JOptionPane.showMessageDialog(null, menu);
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Opcao: "));
			switch(opcao){
			case 1:
				
				Forca forca = Forca.getInstance();
				String nome = JOptionPane.showInputDialog("Digite seu nome");
				forca.novaRodada(nome);
				Rodada nova = forca.getRodada();
				while(true){
					String a = "";
					Boneco.show(nova.getLetrasErradas().size());
					for (int i=0;i<nova.getPalavras().getNome().length();i++){
							if(nova.getLetrasCertas().contains(nova.getPalavras().getNome().charAt(i))){
								a += (nova.getPalavras().getNome().charAt(i));
							}else{
								a+=("_");
							}
						}
					JOptionPane.showMessageDialog(null,a);
					JOptionPane.showMessageDialog(null,"\n"+nova.getPalavras().getTema());
					JOptionPane.showMessageDialog(null," Letras Erradas: "+nova.exibirErradas());
					JOptionPane.showMessageDialog(null," Letras Certas: "+nova.exibirCertas());
					
					if(nova.getStatus()!=Rodada.JOGANDO){break;}
	
					String n = JOptionPane.showInputDialog("\n Digite um caractere!").toUpperCase();
					char m;
					m = Character.charAt(n);
					nova.testaLetra(m);
				}
				
				break;
			case 2: 
				String p = JOptionPane.showInputDialog("Digite uma palavra");
				String t = JOptionPane.showInputDialog("Digite um tema");
				forca.addPalavra(p, t);
			
				break;
			case 0:
				break;
			default:
				
				break;
			}
			
			if (opcao == 0){break;}
		}
	}
}