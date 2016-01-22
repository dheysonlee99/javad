package ativid.interfaces;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3,2);
		System.out.println(a.CalculaArea());
		
		AreaCalculavel b = new Quadrado(9);
		System.out.println(b.CalculaArea());
		
		AreaCalculavel c = new Circulo(2);
		System.out.println(c.CalculaArea());
	}

}
