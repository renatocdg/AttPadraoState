package attPadraoState;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== PRIMEIRO CHAMADO =====");

		Chamado chamado1 = new Chamado(1, "Internet não funciona", "Renato");

		chamado1.resolver();

		chamado1.iniciarAtendimento();

		chamado1.aguardarCliente();

		chamado1.resolver();

		chamado1.responderCliente();

		chamado1.resolver();

		chamado1.cancelar();

		System.out.println("\n===== SEGUNDO CHAMADO =====");

		Chamado chamado2 = new Chamado(2, "Erro no sistema", "Maria");

		chamado2.cancelar();

		chamado2.iniciarAtendimento();
	}
}