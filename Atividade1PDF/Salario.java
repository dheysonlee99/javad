import java.util.Scanner;

public class Salario{
	public static void main(String[] args){
		Scanner input = new  Scanner(System.in);
		String nome;
	 	double salario,vendas,total;
	 	nome = input.nextLine();
	 	salario = input.nextDouble();
	 	vendas = input.nextDouble();
	 	total = salario + (vendas*0.15);

	 	System.out.format("TOTAL = R$ %.2f",total);


	}
}