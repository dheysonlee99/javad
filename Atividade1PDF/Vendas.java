import java.util.Scanner;

public class Vendas {
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	String vendedor = input.nextLine();
	 	double salario = input.nextDouble();
	 	input.nextLine();
	 	double vendas = input.nextDouble();
	 	input.nextLine();
	 	float salariof = (float)(salario + (vendas*0.15));
	 	System.out.println(vendedor);
	 	System.out.format("%.2f ",salariof);
	}
	
}