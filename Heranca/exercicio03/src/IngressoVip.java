class IngressoVip extends Ingresso{
    private double valorAdicional;


    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


    @Override
    public void imprimirValor(){
        System.out.println("Valor do Ingresso: " + (valorAdicional + super.getValor()));
    }

}
