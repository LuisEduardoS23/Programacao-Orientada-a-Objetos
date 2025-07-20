class PecaImportada extends Peca {

    private float taxaImportacao;
    private float taxaFrete;

    PecaImportada() {
        super();
        this.taxaImportacao = 0;
        this.taxaFrete = 0;
    }

    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calcularPreco(){
        float preco = super.calcularPreco();
        return preco + taxaFrete + taxaImportacao;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Taxa de Importacao: " + taxaImportacao);
        System.out.println("Taxa de Frete: " + taxaFrete);
    }

}
