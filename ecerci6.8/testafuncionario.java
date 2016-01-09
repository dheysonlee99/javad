class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario Rm = new Funcionario();
		Data en = new Data();
		en.dia = 9;
		en.mes = 12;
		en.ano = 2014;
		Rm.setNome("lee");
		Rm.setDepartamento("Executivo");
		Rm.setSalario(22000);
		Rm.getrg(098712345654);
		Rm.setData(en);
		
		System.out.println(f1);

		f1.recebeAumento(30000);

		f1.getGanhoAnual();
	
}