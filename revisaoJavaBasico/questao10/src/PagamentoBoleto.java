public class PagamentoBoleto extends Pagamento implements Transacao{

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public String getTipo(){
        String tipo = "Pagamento via Boleto";
        return tipo;
    }

    @Override
    public void validar(){
        System.out.println("Validando código boleto...");
    }

    public void processar(){
        System.out.println("Processando pagamento via boleto...");
    }


}
