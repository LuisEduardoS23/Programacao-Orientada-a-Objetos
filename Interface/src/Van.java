public class Van extends Veiculos implements Alugado {
    private int capacidadePassageiros;

    public Van(String placa, String marca, String modelo, int anoFabricacao, int capacidadePassageiros) {
        super(placa, marca, modelo, anoFabricacao);
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }


    @Override
    public void exibirDados() {
        System.out.println("Van: ");
        super.exibirDados();
        System.out.println("Capacidade Passageiros: " + getCapacidadePassageiros());
    }

    @Override
    public void calcularValorAluguel(int dias) {
        double valor = dias * 180.0;
        System.out.println(getMarca() + " " + getModelo() + " ( " + getAnoFabricacao() + " ) - Valor para 5 dias: R$ " + valor);
    }
}

