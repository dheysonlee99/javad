class Funcionario{
	data dataDeEntrada;
	String nome;
	String departamento;
	float salario;
	String rg;

	void recebeAumento(float aumento){
		salario = salario + aumento;
	}
	float calculoGanhoAnual(){
		float ganhoanual = salario*12;
		return ganhoanual;
	}
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Nome: " + this.departamento);
		System.out.println("Nome: " + this.salario);
		System.out.println("Nome: " + this.dataDeEntrada);
		System.out.println("Nome: " + this.rg);
		System.out.println("Nome: " + this.dataDeEntrada.dia);
		System.out.println("Nome: " + this.dataDeEntrada.mes);
		System.out.println("Nome: " + this.dataDeEntrada.ano);	
	}
}
