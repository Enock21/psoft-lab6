package estadoPessoa;

import sistema.Pessoa;

public class HabDose1 extends Estado{
	
	public HabDose1(){
		super.proxEstado = new TomouDose1();
	}
	
	public void atualizarEstado(Pessoa pessoa) {
		
	}
}
