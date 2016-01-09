class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario rm = new Funcionario();
		Data en = new Data();
		en.dia = 9;
		en.mes = 12;
		en.ano = 2014;
		rm.setNome("lee");
		rm.setDepartamento("Executivo");
		rm.setSalario(22000);
		rm.getrg(098712345654);
		rm.setData(en);
		
		System.out.println(rm);

		rm.recebeAumento(30000);

		rm.getGanhoAnual();
	
}