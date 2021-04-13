package estadoPessoa;

import sistema.Pessoa;

public class NaoHabilitada extends Estado{
	
	public NaoHabilitada(){
		super.proxEstado = new HabDose1();
	}
	
	public void atualizarEstado(Pessoa pessoa) {
		
	}
}
