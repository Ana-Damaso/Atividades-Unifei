package lista2;

import java.util.ArrayList;

public class IngressoVIP extends Ingresso{

//Atributos
	private double valorAdicional;
	
//Construtor
	
	public IngressoVIP(double valorBase, double valorAdicional) {
        super(valorBase); 
        
        this.setValorAdicional(valorAdicional);
    }
	
	public String toString() {
        return "Ingresso VIP: " + this.getValor();
    }
	
	public double getValor() {
        return super.getValor() + this.valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        if (valorAdicional >= 0) {
            this.valorAdicional = valorAdicional;
        } else {
            this.valorAdicional = 0;
        }
    }
    
    public double getValorAdicional() {
        return this.valorAdicional;
    }
		
}
