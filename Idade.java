import java.util.Scanner;

public class Idade{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int id = 0, valor = 0, cont = 0;
	 	while(valor >= 0){
	 		valor = input.nextInt();
	 		id = id + valor;
	 		cont++;
	 	}
	 	float media = id / cont;
	 	System.out.format("%.2f",media);
	}
}