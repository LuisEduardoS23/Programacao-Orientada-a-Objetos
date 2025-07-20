class Estadual extends Produto{

    public Estadual(String descricao, double preco){
        super(descricao, preco, 0.1);
    }

    @Override
    public double valorFinal(){
        double precoFinal = super.getValor() + ( super.getValor() * super.getImposto());
        return precoFinal;
    }

}
