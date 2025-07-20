public class Importado extends Produto{
    private double taxa;
    private double taxaImposto;


    public Importado(String descricao, double preco) {
        super(descricao, preco, 0.1);
        this.taxa = 0.05;
        this.taxaImposto = 0.05;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    @Override
    public double valorFinal(){
        double valorFinal = super.getValor() + (super.getValor() * (super.getImposto() + getTaxa() + getTaxaImposto()));
        return valorFinal;
    }


}
