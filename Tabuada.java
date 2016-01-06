import java.util.Scanner;

public class Tabuada {
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int n = input.nextInt();
	 	int r;
	 	for(int i = 1; (i < 11); i++){
	 		r = i*n;
	 		System.out.format("%d x %d = %d\n", i,n,r);

	 	}

	
}