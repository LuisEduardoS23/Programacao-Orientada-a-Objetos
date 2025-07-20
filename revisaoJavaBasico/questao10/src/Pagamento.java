public abstract class Pagamento {
    double valor;


    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void exibirValor(){
        System.out.println("Valor:   " + valor);
    }

    public abstract String getTipo();

}
