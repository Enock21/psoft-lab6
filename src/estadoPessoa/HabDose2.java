package estadoPessoa;

import sistema.Pessoa;

public class HabDose2 extends Estado{
	public HabDose2(){
		super.proxEstado = new VacFinalizada();
	}

	@Override
	public void atualizarEstado(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}
}

