package estadoPessoa;

import sistema.Pessoa;

public class NaoHabilitada extends Estado{
	
	public NaoHabilitada(){
		super.proxEstado = new HabDose1();
	}
	
	public void atualizarEstado(Pessoa pessoa) {
		if(pessoa.getIdade() >= 60 ||
		pessoa.getProfissao().equals("saude") ||
		pessoa.getComorbidade().equals("positivo")){
			pessoa.setEstado(super.proxEstado);
		}
	}
}
