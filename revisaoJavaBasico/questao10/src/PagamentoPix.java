public class PagamentoPix extends Pagamento implements Transacao{

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public String getTipo(){
        String tipo = "Pagamento via Pix";
        return tipo;
    }

    @Override
    public void validar(){
        System.out.println("Validando chave Pix...");
    }

    public void processar(){
        System.out.println("Processando pagamento Pix...");
    }

}
