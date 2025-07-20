class PassagemEstudante extends Passagem{

    public PassagemEstudante(String nome, double passagem){
        super(nome, passagem);
    }

    @Override
    public double calcularValor(){
        return super.getValorBase() * 0.5;
    }


}
