class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario Rm = new Funcionario();
		Data data = new Data();

		
		Rm.nome = "Dheyson lee";
		Rm.salario = 1000;
		Rm.departamento = "limpeza"
		Rm.rg = "123-09"
		Rm.recebeAumento(900);

		System.out.println("salario atual: " + Rm.salario);
		System.out.println("ganho anual: " + Rm.calculoGanhoAnual);


		Funcionario Bn = new Funcionario();

		Bn.nome = "Joao da Barra";
		Bn.salario = 10000;
		Bn.departamento = "presidente"
		Bn.rg = "123-51"
		Bn.recebeAumento(9000);

		System.out.println("salario atual: " + Bn.salario);
		System.out.println("ganho anual: " + Bn.calculoGanhoAnual);

		Funcionario Jn = new Funcionario();

		Jn.nome = "Ricardo Constancio";
		Jn.salario = 23000;
		Jn.departamento = "gari"
		Jn.rg = "510-88"
		Jn.recebeAumento(9600);

		System.out.println("salario atual: " + Jn.salario);
		System.out.println("ganho anual: " + Jn.calculoGanhoAnual);
		
		Funcionario Fj = new Funcionario();

		Fj.nome = "Maria dos Anjos"
		Fj.salario = 30000
		Fj.departamento = "servicos gerais"
		Fj.rg = "8893-51"

		Funcionario Fk = new Funcionario();

		Fk.nome = "Maria dos Anjos"
		Fk.salario = 30000
		Fk.departamento = "servicos gerais"
		Fk.rg = "8893-51"

		if(Fj == Fk){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
	}
}