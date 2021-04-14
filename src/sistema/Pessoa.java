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
	}
	
	public void verificarEstado(){
		this.estado.atualizarEstado(this);
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

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}

	public int getDiasAposDose1() {
		return diasAposDose1;
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

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", numCartao=" + numCartao
				+ ", email=" + email + ", tel=" + tel + ", profissao=" + profissao + ", comorbidade=" + comorbidade
				+ ", idade=" + idade + ", diasAposDose1=" + diasAposDose1 + ", estado=" + estado + "]";
	}
}
