package estadoPessoa;

import sistema.Pessoa;

public class TomouDose1 extends Estado{

	public TomouDose1(){
		super.proxEstado = new HabDose2();
	}
	
	
	@Override
	public void atualizarEstado(Pessoa pessoa) {
		if (pessoa.getDiasAposDose1() > 20) {
			pessoa.setVacinaHabilitada(true);
			pessoa.setEstado(super.proxEstado);
		}
	}
	
	public String toString() {
		return "tomou a dose 1";
	}

}
