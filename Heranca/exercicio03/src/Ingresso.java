public abstract class Ingresso {

    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public abstract void imprimirValor();

}
