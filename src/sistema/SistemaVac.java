package sistema;

import java.util.ArrayList;
import java.util.List;

public class SistemaVac {
	private List<Pessoa> pessoas;
	
	public SistemaVac() {
		this.pessoas = new ArrayList<>();
	}
	
	public void cadastrar(List<String> atributosStr, int idade, List<String> endereco) {
		String nome = atributosStr.get(0);
		String cpf = atributosStr.get(1);;
		String numCartao = atributosStr.get(2);
		String email = atributosStr.get(3);
		String tel = atributosStr.get(4);
		String profissao = atributosStr.get(5);
		String comorbidade = atributosStr.get(6);
		
		Pessoa pessoa = new Pessoa(nome, cpf, numCartao, email, tel, profissao, comorbidade, idade, endereco);
		
		pessoa.verificarEstado();
		
		this.pessoas.add(pessoa);
	}
	
	@Override
	public String toString() {
		return "SistemaVac [pessoas=" + pessoas + "]";
	}

	public void alterarNome(String nome, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setNome(nome);
			}
		}
	}
	
	public void alterarCpf(String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setCpf(cpf);
			}
		}
	}
	
	public void alterarEndereco(List<String> endereco, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setEndereco(endereco);
			}
		}
	}
	
	public void alterarNumCartao(String numCartao, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setNumCartao(numCartao);
			}
		}
	}
	
	public void alterarEmail(String email, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setEmail(email);
			}
		}
	}
	
	public void alterarTel(String tel, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setTel(tel);
			}
		}
	}
	
	public void alterarProfissao(String profissao, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setProfissao(profissao);
			}
		}
	}
	
	public void alterarComorbidade(String comorbidade, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setComorbidade(comorbidade);
			}
		}
	}
	
	public void alterarIdade(int idade, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setIdade(idade);
			}
		}
	}
	
	public void alterarDiasAposDose1(int dias, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setDiasAposDose1(dias);
			}
		}
	}
}
