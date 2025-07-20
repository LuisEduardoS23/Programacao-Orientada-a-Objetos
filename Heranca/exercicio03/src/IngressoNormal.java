class IngressoNormal extends Ingresso {

    public IngressoNormal(double valor) {
        super(valor);
    }

    @Override
    public void imprimirValor(){
        System.out.println("Valor do Ingresso: " + super.getValor());
    }


}
