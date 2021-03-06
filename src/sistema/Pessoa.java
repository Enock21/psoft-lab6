package sistema;

import java.util.List;

import estadoPessoa.Estado;
import estadoPessoa.NaoHabilitada;

public class Pessoa {
	private String nome;
	private String cpf;
	private List<String> endereco;
	private String numCartao;
	private String email;
	private String tel;
	private String profissao;
	private String comorbidade;
	private int idade;
	private int diasAposDose1;
	private Estado estado;
	private boolean vacinaHabilitada;

	public Pessoa(String nome, String cpf, String numCartao, String email, String tel, String profissao, String comorbidade, int idade, List<String> endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numCartao = numCartao;
		this.email = email;
		this.tel = tel;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
		this.idade = idade;
		
		this.diasAposDose1 = -1;
		this.estado = new NaoHabilitada();
		this.vacinaHabilitada = false;
	}
	
	public String getEstadoStr() {
		return this.estado.toString();
	}

	public void verificarEstado(){
		this.estado.atualizarEstado(this);
	}
	
	public boolean isVacinaHabilitada() {
		return vacinaHabilitada;
	}

	public void setVacinaHabilitada(boolean vacinaHabilitada) {
		this.vacinaHabilitada = vacinaHabilitada;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<String> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<String> endereco) {
		this.endereco = endereco;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissaoEstado(String profissao) {
		this.profissao = profissao;
		verificarEstado();
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}
	
	public void setComorbidadeEstado(String comorbidade) {
		this.comorbidade = comorbidade;
		verificarEstado();
	}

	public int getDiasAposDose1() {
		return diasAposDose1;
	}

	public void setDiasAposDose1Estado(int diasAposDose1) {
		this.diasAposDose1 = diasAposDose1;
		verificarEstado();
	}
	
	public void setDiasAposDose1(int diasAposDose1) {
		this.diasAposDose1 = diasAposDose1;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setIdadeEstado(int idade) {
		this.idade = idade;
		verificarEstado();
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereco: " + endereco + "\nNumero do Cartao: " + numCartao
				+ "\nE-mail: " + email + "\nTelefone: " + tel + "\nProfissao: " + profissao + "\nComorbidade: " + comorbidade
				+ "\nIdade: " + idade + "\nDias Apos Dose 1: " + diasAposDose1 + "\nEstado: " + estado.toString() + "\n";
	}
	
}
