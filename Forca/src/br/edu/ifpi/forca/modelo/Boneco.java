package br.edu.ifpi.forca.modelo;

public class Boneco {
	private static  int numero;
	
	public Boneco(int numero){
		this.numero = numero;
	}
	public static void show(int numero){
		String[] Partes = new String[6];
		Partes[0] = "    O\n ";
		Partes[1] = "  /";
		Partes[2] = "|";
		Partes[3] = "\\\n ";
		Partes[4] = "  /";
		Partes[5] = " \\ ";
		
		for(int i =0;i<numero;i++){
			System.out.print(Partes[i]);
		}
	}

}
