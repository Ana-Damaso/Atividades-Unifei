package lista2;

public class PrincipalEvento {

	public static void main(String[] args) {
System.out.println("--- Criando Ingressos e Evento ---");
        
        Ingresso ingresso1 = new Ingresso(100.0);
        Ingresso ingresso2 = new Ingresso(100.0);
        
        IngressoVIP vip1 = new IngressoVIP(100.00, 50.00);
        IngressoVIP vip2 = new IngressoVIP(100.00, 75.00);

        System.out.println(ingresso1.toString());
        System.out.println(vip1.toString());
        
        EventoIngresso show1 = new EventoIngresso ("Show Ana");
        show1.adicionarIngresso(ingresso1);
        show1.adicionarIngresso(ingresso2);
        show1.adicionarIngresso(vip1);
        show1.adicionarIngresso(vip2);

        show1.imprimirNaoVendidos();

        ingresso1.vender();
        vip1.vender();
        
        double totalVendido = show1.getValorTotalVendidos();
        System.out.println("Valor total dos ingressos: " + totalVendido);
        
        show1.imprimirNaoVendidos();
        
	}

}
