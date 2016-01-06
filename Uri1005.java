import java.util.Scanner;

class Media{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	float a = input.nextFloat();
	 	float b = input.nextFloat();
	 	float media = ((a*3.5)+(b*7.5))/(11.0);
	 	System.out.format("MEDIA = %.5f",media);
	}
	
}