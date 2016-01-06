import java.util.Scanner;

public class Combustivel{
	 public static void main(String[] args) {

	 	Scanner input = new  Scanner(System.in);
	 	int alc = 0;
	 	int gas = 0;
	 	int die = 0;
	 	int val
	 	while(true){
	 		val = input.nextInt();
	 		if(val == 1){
	 			alc++;
	 		}if(val == 2){
	 			gas++;
	 		}if(val == 3){
	 			die++;
	 		}if(val < 1 && val > 4){
	 			val = input.nextInt();
	 		}
	 	}
	 	System.out.format("Muito Obrigado:\nAlcool: %d\nGasolina: %d\nDiesel: %d", alc,gas,die);
	}
}