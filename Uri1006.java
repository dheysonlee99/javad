import java.util.Scanner;

class Media2{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	float a = input.nextFloat();
	 	float b = input.nextFloat();
	 	float c = input.nextFloat();
	 	float media = ((a*2.0)+(b*3.0)+(c*5.0))/(10.0);
	 	System.out.format("MEDIA = %.f",media);
	}
	
}