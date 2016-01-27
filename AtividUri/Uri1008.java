import java.util.Scanner;

class Salario{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int numero = input.nextInt();
	 	int horas = input.nextInt();
	 	float valph = input.nextFloat();
	 	float salary = horas*valph;
	 	System.out.println("NUMBER = "+ numero);
	 	System.out.format("SALARY = U$ %.2f",salary);
	}
	
}