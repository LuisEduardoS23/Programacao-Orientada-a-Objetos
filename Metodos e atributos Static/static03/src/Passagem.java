public class Passagem {
    private String nomePassageiro;
    private double valorBase;


    public Passagem(String nomePassageiro, double valorBase) {
        this.nomePassageiro = nomePassageiro;
        this.valorBase = valorBase;
    }

    public double getValorBase() {
        return valorBase;
    }

    public double calcularValor(){
        return valorBase;
    }

    public String toString(){
        String retorno = (" Passagem: " + nomePassageiro + "  |   Valor: R$" + calcularValor());
        return retorno;
    }

}
