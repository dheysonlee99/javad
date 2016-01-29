import java.util.Scanner;

public class Cobaia{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n,i,coelhos = 0,ratos = 0,sapos = 0, total = 0;
		n = input.nextInt();
		String c = "s";

		for(i=0;i<n;i++){
			Scanner input2 = new Scanner(System.in);
			int num;
			
			num = input2.nextInt();
			c = input2.nextLine();
			if(c.equals(" C")){
				coelhos += num;
			}
			else if(c.equals(" R")){
				ratos += num;
			}
			else{
				sapos += num;
			}
			total += num;
		}
		float pc = (float)((coelhos*100.0)/total);
		float pr = (float)((ratos*100.0)/total);
		float ps = (float)((sapos*100.0)/total);
		System.out.printf("Total: %d cobaias",total);
		System.out.printf("\nTotal de coelhos: %d",coelhos);
		System.out.printf("\nTotal de ratos: %d",ratos);
		System.out.printf("\nTotal de sapos: %d",sapos);
		System.out.printf("\nPercentual de coelhos: %.2f %%",pc);
		System.out.printf("\nPercentual de ratos: %.2f %%",pr);
		System.out.printf("\nPercentual de sapos: %.2f %%\n",ps);
	} 

}