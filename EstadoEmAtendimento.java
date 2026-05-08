package attPadraoState;

public class EstadoEmAtendimento implements EstadoChamado {

	@Override
	public void iniciarAtendimento(Chamado chamado) {
		System.out.println("O chamado já está em atendimento.");
	}

	@Override
	public void aguardarCliente(Chamado chamado) {
		System.out.println("Chamado aguardando resposta do cliente.");
		chamado.setEstado(new EstadoAguardandoCliente());
	}

	@Override
	public void responderCliente(Chamado chamado) {
		System.out.println("O cliente ainda não foi solicitado.");
	}

	@Override
	public void resolver(Chamado chamado) {
		System.out.println("Chamado resolvido.");
		chamado.setEstado(new EstadoResolvido());
	}

	@Override
	public void cancelar(Chamado chamado) {
		System.out.println("Chamado cancelado.");
		chamado.setEstado(new EstadoCancelado());
	}
}