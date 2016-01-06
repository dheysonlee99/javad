import java.util.Scanner;

public class Pares {
	 public static void main(String[] args) {

        int pares = 0, valor;
	 	Scanner input = new  Scanner(System.in);
	 	for(i = 0; (i < 5);i++){
	 		valor = input.nextInt();
	 		if (valor%2 == 0){
	 			pares++;
	 		}

	 	}
	 	System.out.format("%d valores pares",pares);
	}
	
}