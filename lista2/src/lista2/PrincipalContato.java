package lista2;

public class PrincipalContato {

	public static void main(String[] args) {

		Contato contatoInvalido = new Contato(101);
		
		Contato telefoneInvalido = new Contato("954812");

		AgendaContato agendaPrincipal = new AgendaContato("Agenda da faculdade", "Colegas do curso");
		
		ClienteContato clienteLogado = new ClienteContato("Samuel", agendaPrincipal);
		
		Contato contatoAna = new Contato(1001, "Ana", "ana@email.com");
		
		Contato contatoClara = new Contato(2500, "Clara", "Clara@email.com");
        contatoClara.setTelefone("12345678");
        contatoClara.setEndereco("Rua A, 123");
        contatoClara.setObservacao("Numero novo");
        
        clienteLogado.adicionarContatoNaAgenda(contatoAna);
        clienteLogado.adicionarContatoNaAgenda(contatoClara);
		
        clienteLogado.imprimirContatosDaMinhaAgenda();
        
        Contato claraDuplicado = contatoClara.duplicarContato();
        claraDuplicado.setNome("Clara 2");
        claraDuplicado.setCodigo(2501);
        
        clienteLogado.adicionarContatoNaAgenda(claraDuplicado);
        
        clienteLogado.imprimirContatosDaMinhaAgenda();
	}

}
