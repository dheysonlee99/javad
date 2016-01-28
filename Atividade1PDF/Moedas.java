import java.util.Scanner;

public class Moedas{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float valor;
		float notas;
		valor = input.nextFloat();
		notas = (float)(valor / 100.0);
		int n = (int)(notas);
		valor = (float)(valor % 100.0);
		System.out.printf("NOTAS:");
		System.out.printf("\n%d notas de 100.00",n);
		notas = (float)(valor / 50.0);
		n = (int)(notas);
		valor = (float)(valor % 50.0);
		System.out.printf("\n%d notas de 50.00",n);
		notas = (float)(valor / 20.0);
		n = (int)(notas);
		valor = (float)(valor % 20.0);
		System.out.printf("\n%d notas de 20.00",n);
		notas = (float)(valor / 10.0);
		n = (int)(notas);
		valor = (float)(valor % 10.0);
		System.out.printf("\n%d notas de 10.00",n);
		notas = (float)(valor / 5.0);
		n = (int)(notas);
		valor = (float)(valor % 5.0);
		System.out.printf("\n%d notas de 5.00",n);
		notas = (float)(valor / 2.0);
		n = (int)(notas);
		valor = (float)(valor % 2.0);
		System.out.printf("\n%d notas de 2.00",n);
		System.out.printf("\nMOEDAS");
		notas = (float)(valor / 1.0);
		n = (int)(notas);
		valor = (float)(valor % 1.0);
		System.out.printf("\n%d moedas de 1.00",n);
		notas = (float)(valor / 0.50);
		n = (int)(notas);
		valor = (float)(valor % 0.50);
		System.out.printf("\n%d moedas de 0.50",n);
		notas = (float)(valor / 0.25);
		n = (int)(notas);
		valor = (float)(valor % 0.25);
		System.out.printf("\n%d moedas de 0.25",n);
		notas = (float)(valor / 0.10);
		n = (int)(notas);
		valor = (float)(valor % 0.10);
		System.out.printf("\n%d moedas de 0.10",n);
		notas = (float)(valor / 0.05);
		n = (int)(notas);
		valor = (float)(valor % 0.05);
		System.out.printf("\n%d moedas de 0.05",n);
		notas = (float)(valor / 0.01);
		n = (int)(notas);
		System.out.printf("\n%d moedas de 0.01",n);


	}
}