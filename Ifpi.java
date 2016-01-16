import java.util.Scanner;

public class Ifpi {
	 public static void main(String[] args) {

	 	String ifpi;
        int n;
	 	Scanner input = new  Scanner(System.in);
	 	n = input.nextInt();
	 	for(int i=1; (i <= (n*4));i++){
	 		if(i%4 != 0){
	 			System.out.format("%d ",i);
	 		}
	 		else{
	 			System.out.println("IFPI");
	 		}

	 	}
	}
}

