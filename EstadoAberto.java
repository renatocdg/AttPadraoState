package attPadraoState;

public class EstadoAberto implements EstadoChamado {

	@Override
	public void iniciarAtendimento(Chamado chamado) {
		System.out.println("Atendimento iniciado.");
		chamado.setEstado(new EstadoEmAtendimento());
	}

	@Override
	public void aguardarCliente(Chamado chamado) {
		System.out.println("Não é possível aguardar cliente com chamado aberto.");
	}

	@Override
	public void responderCliente(Chamado chamado) {
		System.out.println("Não há resposta do cliente para um chamado aberto.");
	}

	@Override
	public void resolver(Chamado chamado) {
		System.out.println("Não é possível resolver um chamado que ainda está aberto.");
	}

	@Override
	public void cancelar(Chamado chamado) {
		System.out.println("Chamado cancelado.");
		chamado.setEstado(new EstadoCancelado());
	}
}