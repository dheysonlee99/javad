import java.util.Scanner;

public class Lesmas{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n,i,e,a = -1,k;
		n = input.nextInt();
		int[] lesmas = new int[n];
		while(n >= 1){
			for(i = 0; i<n;i++){
				lesmas[i] = input.nextInt();
			}
			for(e = 0;e<n;e++){
				if(lesmas[e] > a){
					a = lesmas[e];
				}
			}
			if(a < 10){
				k = 1;
				System.out.println(k);
			}
			else if(a < 20){
				k = 2;
				System.out.println(k);
			}
			else{
				k = 3;
				System.out.println(k);
			}
			n = input.nextInt();
		}
	}
}
		
