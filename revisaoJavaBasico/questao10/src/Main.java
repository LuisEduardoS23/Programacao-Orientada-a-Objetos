public class Main {
    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoCartao(375.99);
        pagamentos[1] = new PagamentoPix(74.99);
        pagamentos[2] = new PagamentoBoleto(123.49);

        for (Pagamento p : pagamentos){
        System.out.println(p.getTipo());
        p.exibirValor();
            if (p instanceof Transacao){
                ((Transacao)p).validar();
                ((Transacao)p).processar();
            }

            System.out.println("=================================\n");
        }

    }
}