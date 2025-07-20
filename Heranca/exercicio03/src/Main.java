public class Main {

    public static void main(String[] args) {

        IngressoNormal ingresso1 = new IngressoNormal(74.99);
        IngressoVip ingresso2 = new IngressoVip(74.99, 15);
        VipCamaroteInferior ingresso3 = new VipCamaroteInferior(74.99, 15, "Setor B, fila 2");
        VipCamaroteSuperior ingresso4 = new VipCamaroteSuperior(74.99, 15, 19.99);

        ingresso1.imprimirValor();
        System.out.println(("\n\n"));
        ingresso2.imprimirValor();
        System.out.println(("\n\n"));
        ingresso3.imprimirValor();
        System.out.println("Localização: " + ingresso3.getLocalizacao());
        System.out.println(("\n\n"));
        System.out.println("Valor do Ingresso: " + ingresso4.getValorCamaroteSuperior());



    }
}