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
		this.pessoas.add(pessoa);
	}
	
	@Override
	public String toString() {
		return "SistemaVac [pessoas=" + pessoas + "]";
	}

	public void alterarNome(String nome) {}
	
	public void alterarCpf(String cpf) {}
	
	public void alterarEndereco(List<String> endereco) {}
	
	public void alterarNumCartao(String numCartao) {}
	
	public void alterarEmail(String email) {}
	
	public void alterarTel(String tel) {}
	
	public void alterarProfissao(String profissao) {}
	
	public void alterarComorbidade(String comorbidade) {}
	
	public void alterarDiasAposDose1(int dias) {}
}
