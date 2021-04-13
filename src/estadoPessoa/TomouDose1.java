package estadoPessoa;

import sistema.Pessoa;

public class TomouDose1 extends Estado{

	public TomouDose1(){
		super.proxEstado = new HabDose2();
	}
	
	
	@Override
	public void atualizarEstado(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

}
