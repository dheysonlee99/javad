class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario Rm = new Funcionario();

		Rm.nome = "Dheyson lee";
		Rm.salario = 1000;
		Rm.departamento = "limpeza"
		Rm.data = "30/10/1994"
		Rm.rg = "123-09"
		Rm.recebeAumento(900);

		System.out.println("salario atual: " + Rm.salario);
		System.out.println("ganho anual: " + Rm.calculoGanhoAnual);


		Funcionario Bn = new Funcionario();

		Bn.nome = "Joao da Barra";
		Bn.salario = 10000;
		Bn.departamento = "presidente"
		Bn.data = "10/10/2010"
		Bn.rg = "123-51"
		Bn.recebeAumento(9000);

		System.out.println("salario atual: " + Bn.salario);
		System.out.println("ganho anual: " + Bn.calculoGanhoAnual);

		Funcionario Jn = new Funcionario();

		Jn.nome = "Ricardo Constancio";
		Jn.salario = 23000;
		Jn.departamento = "gari"
		Jn.data = "30/12/1998"
		Jn.rg = "510-88"
		Jn.recebeAumento(9600);

		System.out.println("salario atual: " + Jn.salario);
		System.out.println("ganho anual: " + Jn.calculoGanhoAnual);

	}
}