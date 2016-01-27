import java.util.Scanner;

public class Positivos {
	 public static void main(String[] args) {

        int positivos = 0;
        float valor;
	 	Scanner input = new  Scanner(System.in);
	 	for(i = 0; (i < 5);i++){
	 		valor = input.nextFloat();
	 		if (valor > 0.0){
	 			positivos++;
	 		}

	 	}
	 	System.out.format("%d valores positivos",positivos);
	}
	
}