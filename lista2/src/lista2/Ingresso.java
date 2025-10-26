package lista2;

public class Ingresso {

//Atributos
	private double valor;
	
	private boolean vendido;
	
	
	
//Construtor
	
	public Ingresso(double valor) {
		
		this.valor = valor;
		this.vendido = false;
		
	}
	
	
	
//Metodos
	
	public String toString() {
        return "Ingresso Normal: " + this.valor;
    }
	
	public double getValor() { 
		return this.valor; 
		}
	
	public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
        }
    }
	
	public boolean isVendido() { 
		return this.vendido; 
		}

	public void vender() { 
		this.vendido = true; 
		}

	
	
	
	
	
	
}
