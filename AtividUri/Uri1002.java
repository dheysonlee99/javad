import java.util.Scanner;

class Circulo{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	float raio = input.nextFloat();
	 	float r = 3.14159;
	 	float area = (raio**2)*r
	 	System.out.format("A = %.4f",area);
	}
	
}