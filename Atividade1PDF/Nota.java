import java.util.Scanner;

public class Nota{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	float nota1,nota2;
	 	nota1 = input.nextFloat();
	 	nota2 = input.nextFloat();
	 	while(nota1 < 0){
	 		System.out.println("nota invalida");
	 		nota1 = input.nextFloat();
	 	}
	 	while(nota2 < 0){
	 		System.out.println("nota invalida");
	 		nota2 = input.nextFloat();	 	
	 	}
	 	float media = (nota1+nota2)/2;



	 	
	 	System.out.format("media = %.2f",media);
	}
}