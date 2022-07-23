package model;

import java.util.ArrayList;

public class Time {
	private String nome;
	private Integer pontosObtidos;
	private Integer golsFeitos;
	private Integer golsTomados;
	private ArrayList<Funcionario> func;
	
	public Time() {
		super();
		func = new ArrayList<Funcionario>();
	}

	public Time(String nome, Integer pontosObtidos, Integer golsFeitos, Integer golsTomados,
			ArrayList<Funcionario> func) {
		super();
		this.nome = nome;
		this.pontosObtidos = pontosObtidos;
		this.golsFeitos = golsFeitos;
		this.golsTomados = golsTomados;
		this.func = func;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontosObtidos() {
		return pontosObtidos;
	}

	public void setPontosObtidos(Integer pontosObtidos) {
		this.pontosObtidos = pontosObtidos;
	}

	public Integer getGolsFeitos() {
		return golsFeitos;
	}

	public void setGolsFeitos(Integer golsFeitos) {
		this.golsFeitos = golsFeitos;
	}

	public Integer getGolsTomados() {
		return golsTomados;
	}

	public void setGolsTomados(Integer golsTomados) {
		this.golsTomados = golsTomados;
	}

	public ArrayList<Funcionario> getFunc() {
		return func;
	}

	public void setFunc(ArrayList<Funcionario> func) {
		this.func = func;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", pontosObtidos=" + pontosObtidos + ", golsFeitos=" + golsFeitos
				+ ", golsTomadosInteger=" + golsTomados + ", func=" + func + "]";
	//TODO - acrescentar os nomes dos funcionarios
	} 
	

}
