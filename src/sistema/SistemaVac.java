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
	
	public String getEstado(String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa.getEstadoStr();
			}
		}
		
		return "CPF nao cadastrado.\n";
	}
	
	public String getPessoa(String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				return pessoa.toString();
			}
		}
		
		return "CPF nao cadastrado.\n";
	}
	
	public String vacinar(String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				if (pessoa.isVacinaHabilitada()) {
					pessoa.verificarEstado();
					return "Vacina aplicada com sucesso. O estado atual eh: " + pessoa.getEstadoStr() + ".\n";
				}else {
					return "Usuario nao habilitado a vacina.\n";
				}
			}
		}
		
		return "CPF nao cadastrado.\n";
	}
	
	public String listar() {
		int count = 0;
		String pessoasStr = "PESSOAS CADASTRADAS:\n";
		for (Pessoa pessoa : this.pessoas) {
			pessoasStr = pessoasStr + pessoa.toString() + "\n";
		}
		return pessoasStr;
	}

	public String alterarNome(String nome, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setNome(nome);
				return "Nome alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarCpf(String velhoCpf, String novoCpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(velhoCpf)) {
				pessoa.setCpf(novoCpf);
				return "CPF alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarEndereco(List<String> endereco, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setEndereco(endereco);
				return "Endereco alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarNumCartao(String numCartao, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setNumCartao(numCartao);
				return "Numero do cartao alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarEmail(String email, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setEmail(email);
				return "E-mail alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarTel(String tel, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setTel(tel);
				return "Telefone alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarProfissao(String profissao, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setProfissaoEstado(profissao);
				return "Profissao alterada com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarComorbidade(String comorbidade, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setComorbidadeEstado(comorbidade);
				return "Comorbidade alterada com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarIdade(int idade, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setIdadeEstado(idade);
				return "Idade alterada com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public String alterarDiasAposDose1(int dias, String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoa.setDiasAposDose1Estado(dias);
				return "Dias apos dose 1 alterado com sucesso!";
			}
		}
		
		return "CPF nao cadastrado.";
	}
	
	public boolean cpfExiste(String cpf) {
		for(Pessoa pessoa : this.pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				return true;
			}
		}
		
		return false;
	}
}
