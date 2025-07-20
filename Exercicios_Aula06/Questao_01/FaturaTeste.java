public class FaturaTeste {
    public static void main(String[] args) throws Exception {
        
        Fatura produto1 = new Fatura("0001", "Memoria RAM", 2, 375.00);
        Fatura produto2 = new Fatura("0002", "Cabo USB", -4, 45.00);

        System.out.println("FATURA 01");
        System.out.println(produto1.getDescricao() + "      NUMERO: " + produto1.getNumero()+ "     PRECO: R$ "+ produto1.getPreco()+ "     QUANTIDADE: "+ produto1.getQuantidade());
        System.out.println("TOTAL:  " + produto1.getTotalFatura());


        System.out.println("FATURA 02");
        System.out.println(produto2.getDescricao() + "      NUMERO: " + produto2.getNumero()+ "     PRECO: R$ "+ produto2.getPreco()+ "     QUANTIDADE: "+ produto2.getQuantidade());
        System.out.println("TOTAL:  " + produto2.getTotalFatura());
        




    }
}
