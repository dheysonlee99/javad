class Funcionario{
	private String nome;
	private Data entrada;
	private String departamento;
	private float salario;
	private String rg;
	

	public String getNome() {
	    return nome;
	  }
	public String setNome(String nome) {
		this.nome = nome;
	  }

	public Data getData() {
	    return entrada;
	  }
	public Data setData(Data entrada) {
		this.entrada = entrada;
	  }
	
	public String getDepartamento() {
	    return departamento;
	  }
	public String setDepartamento(String departmento) {
		this.departamento = departamento;
	  }
	
	public float getSalario() {
	    return salario;
	  }
	
	public void setSalario(float salario) {
	    this.salario = salario;
	  }
	
	public String getrg(){
		return rg;
	}
	public String setrg(String rg){
		this.rg = rg;
}

	void recebeAumento(float aumento){
		salario = salario + aumento;
	}
	float getGanhoAnual(){
		System.out.println("ganho anual"+salario*12);
	}

}
