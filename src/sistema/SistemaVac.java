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
	
	public void vacinar(String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				if (pessoa.isVacinaHabilitada()) {
					pessoa.verificarEstado();
					break;
				}else {
					throw new IllegalArgumentException("Usuario nao habilitado a vacina.");
				}
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	@Override
	public String toString() {
		return "SistemaVac [pessoas=" + pessoas + "]";
	}

	public void alterarNome(String nome, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setNome(nome);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarCpf(String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setCpf(cpf);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarEndereco(List<String> endereco, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setEndereco(endereco);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarNumCartao(String numCartao, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setNumCartao(numCartao);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarEmail(String email, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setEmail(email);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarTel(String tel, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setTel(tel);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarProfissao(String profissao, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setProfissaoEstado(profissao);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarComorbidade(String comorbidade, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setComorbidadeEstado(comorbidade);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarIdade(int idade, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setIdadeEstado(idade);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
	
	public void alterarDiasAposDose1(int dias, String cpf) {
		boolean cpfCadastrado = false;
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				cpfCadastrado = true;
				pessoa.setDiasAposDose1Estado(dias);
			}
		}
		
		if (!cpfCadastrado) { throw new IllegalArgumentException("CPF nao cadastrado."); }
	}
}
