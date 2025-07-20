public class PagamentoCartao extends Pagamento implements Transacao{

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public String getTipo(){
        String tipo = "Pagamento via Cartão";
        return tipo;
    }

    @Override
    public void validar(){
        System.out.println("Validando cartão de crédito...");
    }

    public void processar(){
        System.out.println("Processando pagamento via cartão...");
    }


}
