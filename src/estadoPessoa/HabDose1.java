package estadoPessoa;

import sistema.Pessoa;

public class HabDose1 extends Estado{
	
	public HabDose1(){
		super.proxEstado = new TomouDose1();
	}
	
	public void atualizarEstado(Pessoa pessoa) {
		pessoa.setVacinaHabilitada(false);
		pessoa.setDiasAposDose1(0);
		pessoa.setEstado(super.proxEstado);
	}
	
	public String toString() {
		return "habilitado a dose 1";
	}
}
