class Funcionario{
	String nome;
	String departamento;
	float salario;
	String data;
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
		System.out.println("Nome: " + this.data);
		System.out.println("Nome: " + this.rg);
	}
}