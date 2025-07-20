class Nacional extends Produto {
    private double taxa;

    public Nacional(String descricao, double preco) {
        super(descricao, preco, 0.1);
        this.taxa = 0.05;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double valorFinal(){
        double valorFinal = super.getValor() + (super.getValor() * (super.getImposto() + getTaxa()));
        return valorFinal;
    }


}
