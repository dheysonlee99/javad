import java.util.Scanner;

class Media2{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int codp = input.nextInt();
	 	int np = input.nextInt();
	 	float valor = input.nextFloat();
	 	int codp2 = input.nextInt();
	 	int np2 = input.nextInt();
	 	float valor2 = input.nextFloat();
	 	float total = (np*valor)+(np2*valor2)
	 	System.out.format("VALOR A PAGAR = %.2f",total);
	}
	
}