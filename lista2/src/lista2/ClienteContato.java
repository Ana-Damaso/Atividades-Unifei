package lista2;

public class ClienteContato {

//Atributos
    private String nome;
    private AgendaContato agendaPessoal;

//Construtor

    public ClienteContato(String nome, AgendaContato agenda) {
        
        this.nome = nome;
        this.agendaPessoal = agenda;
    }
    
//Métodos

    public String getNome() {
        return this.nome;
    }

public void adicionarContatoNaAgenda(Contato novoContato) {
    this.agendaPessoal.adicionarContato(novoContato);
}

public void imprimirContatosDaMinhaAgenda() {
    this.agendaPessoal.imprimirTodosOsContatos();
}
}