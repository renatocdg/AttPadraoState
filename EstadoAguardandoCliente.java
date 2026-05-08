package attPadraoState;

public class EstadoAguardandoCliente implements EstadoChamado {

	@Override
	public void iniciarAtendimento(Chamado chamado) {
		System.out.println("Chamado aguardando cliente. Aguarde resposta.");
	}

	@Override
	public void aguardarCliente(Chamado chamado) {
		System.out.println("O chamado já está aguardando cliente.");
	}

	@Override
	public void responderCliente(Chamado chamado) {
		System.out.println("Cliente respondeu. Retornando atendimento.");
		chamado.setEstado(new EstadoEmAtendimento());
	}

	@Override
	public void resolver(Chamado chamado) {
		System.out.println("Não é possível resolver enquanto aguarda cliente.");
	}

	@Override
	public void cancelar(Chamado chamado) {
		System.out.println("Chamado cancelado.");
		chamado.setEstado(new EstadoCancelado());
	}
}