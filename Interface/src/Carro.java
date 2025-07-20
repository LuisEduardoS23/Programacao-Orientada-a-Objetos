public class Carro extends Veiculos implements Alugado{
    private int portas;

    public Carro(String placa, String marca, String modelo, int anoFabricacao, int portas) {
        super(placa, marca, modelo, anoFabricacao);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    @Override
    public void exibirDados(){
        System.out.println("Carro: ");
        super.exibirDados();
        System.out.println("Portas: " + getPortas());
    }

    @Override
    public void calcularValorAluguel(int dias){
        double valor = dias * 120.0;
        System.out.println(getMarca() + " " + getModelo() + " ( " + getAnoFabricacao() + " ) - Valor para 5 dias: R$ " + valor);

}


}
