import java.util.Scanner;

public class Senha {
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int valor, i = 0;
	 	while(i < 3){
	 		valor = input.nextInt();
	 		if(valor == 2002){
	 			System.out.println("Acesso permitido");
	 			break;
	 		}else if(i == 2 && valor != 2002){
	 			System.out.println("Acesso permitido");
	 			break;
	 		}
	 		i++;
	 	}
	}
	
}