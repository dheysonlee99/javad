import java.util.Scanner;

public class Consumo {
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int distancia;
	 	float litros;
	 	distancia = input.nextInt();
	 	input.nextLine();
	 	litros = input.nextFloat();
	 	input.nextLine();
	 	System.out.format("%.3f km/l", distancia/litros);
	}
	
}