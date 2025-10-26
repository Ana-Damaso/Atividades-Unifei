package lista2;

public class Fatura {

//Atributos
	
	private int itemFaturado;
	
	private String descricaoItem;
	
	private int quantidadeComprada;
	
	private double precoUnitario;
	
	
//Contrutor
	
	public Fatura (int itemFaturado, String descricaoItem, int quantidadeComprada, double precoUnitario) {
	
		setItemFaturado(itemFaturado);
		this.descricaoItem = descricaoItem;
		setQuantidadeComprada(quantidadeComprada);
		setPrecoUnitario(precoUnitario);
}
//Metodos
	
	public int getItemFaturado() {
		return this.itemFaturado;	
	}
	
	public void setItemFaturado(int itemFaturado) {
		if(itemFaturado < 0) {
			this.itemFaturado = 0;
		}else {
			this.itemFaturado = itemFaturado;
		}
			
	}
	

	public String getDescricaoItem() {
		return this.descricaoItem;	
	}
	
	public void setDescricaoItem(String descricaoItem) {
		if(descricaoItem != null && !descricaoItem.isEmpty()) {
			this.descricaoItem =  descricaoItem;
		}else {
			System.out.println("Erro, tente novamente!");
		}
			
	}	
	

	public int getQuantidadeComprada() {
		return this.quantidadeComprada;	
	}
	
	public void setQuantidadeComprada(int quantidadeComprada) {
		if(quantidadeComprada < 0) {
			this.quantidadeComprada = 0;
		}else {
			this.quantidadeComprada = quantidadeComprada;
		}
			
	}
	
	
	public double getPrecoUnitario() {
		return this.precoUnitario;	
	}
	
	public void setPrecoUnitario(double precoUnitario) {
		if(precoUnitario < 0) {
			this.precoUnitario = 0;
		}else {
			this.precoUnitario = precoUnitario;
		}
			
	}
	
	
	public double getValorFatura() {
		return this.quantidadeComprada * this.precoUnitario;
		}
	
	
	public void aplicarDesconto(double porcentagem) {
		double novoPreco = this.precoUnitario * (1.0 - porcentagem);
		setPrecoUnitario(novoPreco);
	}
}