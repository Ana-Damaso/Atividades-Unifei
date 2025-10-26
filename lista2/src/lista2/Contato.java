package lista2;

public class Contato {

//Atributos

	private int codigo;
	private String nome;
	private String endereco;
	private String email;
	private String telefone;
	private String observacao;

//Construtor	

	public Contato(int codigo) {
		setCodigo(codigo);
	}

	public Contato(int codigo, String nome) {
		setCodigo(codigo);
		this.nome = nome;
	}

	public Contato(int codigo, String nome, String email) {
		setCodigo(codigo);
		this.nome = nome;
		this.email = email;
	}

	public Contato(String telefone) {
		setTelefone(telefone);
	}

	public Contato(Contato outroContato) {

		setNome(outroContato.nome);
		setEndereco(outroContato.endereco);
		setTelefone(outroContato.telefone);
		setObservacao(outroContato.observacao);
		this.email = outroContato.email;
	}

//Metodos

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo >= 1000 && codigo <= 9999) {
			this.codigo = codigo;
		} else {
			this.codigo = 0;
			System.out.println("Erro: Código " + codigo + " é inválido");
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return this.email;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone != null && telefone.length() == 8) {
			this.telefone = telefone;
		} else {
			this.telefone = null;
			System.out.println("Erro, telefone não cadastrado!");
		}
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void imprimirContato() {
		System.out.println("Os dados do contato são: Código: " + codigo + "/ Nome: " + nome + "/ Endereço: " + endereco
				+ "/ Email: " + email + "/ Telefone: " + telefone + "/ Observações: " + observacao);

	}

	public Contato duplicarContato() {

		return new Contato(this);
	}
	
	public boolean estaPreenchido() {
	    
	    
	    boolean codigoValido = (this.codigo != 0); 
	    boolean telefoneValido = (this.telefone != null);
	    boolean nomeValido = (this.nome != null && !this.nome.isEmpty());
	    boolean enderecoValido = (this.endereco != null && !this.endereco.isEmpty());
	    boolean emailValido = (this.email != null && !this.email.isEmpty());
	    boolean observacaoValida = (this.observacao != null && !this.observacao.isEmpty());

	    return codigoValido && telefoneValido && nomeValido && 
	           enderecoValido && emailValido && observacaoValida;
	}

}
