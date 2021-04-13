package estadoPessoa;

import sistema.Pessoa;

public abstract class Estado {
	protected Estado proxEstado;
	
	public Estado() {
		this.proxEstado = null;
	}
	
	public abstract void atualizarEstado(Pessoa pessoa);
}
