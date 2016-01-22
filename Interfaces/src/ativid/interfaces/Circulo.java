package ativid.interfaces;
public class Circulo implements AreaCalculavel {
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	@Override
	public double CalculaArea() {
		return Math.PI*(this.raio*this.raio);
	}

}
