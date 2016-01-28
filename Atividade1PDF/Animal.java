import java.util.Scanner;

public class Animal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String n1,n2,n3;
		n1 = input.nextLine();
		n2 = input.nextLine();
		n3 = input.nextLine();
		if(n1.equals("vertebrado") && n2.equals("ave") && n3.equals("carnivoro")){
			System.out.println("aguia");
		}
		else if(n1.equals("vertebrado") && n2.equals("ave") && n3.equals("onivoro")){
			System.out.println("pomba");
		}
		else if(n1.equals("vertebrado") && n2.equals("mamifero") && n3.equals("onivoro")){
			System.out.println("homem");
		}
		else if(n1.equals("vertebrado") && n2.equals("mamifero") && n3.equals("herbivoro")){
			System.out.println("vaca");
		}
		else if(n1.equals("invertebrado") && n2.equals("inseto") && n3.equals("hematofago")){
			System.out.println("pulga");
		}
		else if(n1.equals("invertebrado") && n2.equals("inseto") && n3.equals("herbivoro")){
			System.out.println("lagarta");
		}
		else if(n1.equals("invertebrado") && n2.equals("anelideo") && n3.equals("hematofago")){
			System.out.println("sanguessuga");
		}
		else if(n1.equals("invertebrado") && n2.equals("anelideo") && n3.equals("onivoro")){
			System.out.println("minhoca");
		}
	}
}