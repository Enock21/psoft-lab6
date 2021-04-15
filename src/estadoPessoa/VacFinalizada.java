package estadoPessoa;

import sistema.Pessoa;

public class VacFinalizada extends Estado{

	public VacFinalizada() {
		super.proxEstado = null;
	}
	
	@Override
	public void atualizarEstado(Pessoa pessoa) {}

}
