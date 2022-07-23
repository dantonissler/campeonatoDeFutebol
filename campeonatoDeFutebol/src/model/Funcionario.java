package model;

public class Funcionario {

	private String nome;
	private String dtTerminoContrato;
	private Double salario;
	private String posicao;
	private Integer golsfeitos;
	private Character tipo; //J ou T
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String dtTerminoContrato, Double salario, String posicao, Integer golsfeitos,
			Character tipo) {
		super();
		this.nome = nome;
		this.dtTerminoContrato = dtTerminoContrato;
		this.salario = salario;
		this.posicao = posicao;
		this.golsfeitos = golsfeitos;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtTerminoContrato() {
		return dtTerminoContrato;
	}

	public void setDtTerminoContrato(String dtTerminoContrato) {
		this.dtTerminoContrato = dtTerminoContrato;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getGolsfeitos() {
		return golsfeitos;
	}

	public void setGolsfeitos(Integer golsfeitos) {
		this.golsfeitos = golsfeitos;
	}

	public Character getTipo() {
		return tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", dtTerminoContrato=" + dtTerminoContrato + ", salario=" + salario
				+ ", posicao=" + posicao + ", golsfeitos=" + golsfeitos + ", tipo=" + tipo + "]";
	}

}
