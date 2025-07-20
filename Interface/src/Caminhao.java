public class Caminhao extends Veiculos{
    private double capacidadeCarga;
    private int numeroEixos;

    public Caminhao(String placa, String marca, String modelo,int anoFabricacao, double capacidadeCarga, int numeroEixos) {
        super(placa, marca, modelo, anoFabricacao);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    @Override
    public void exibirDados(){
        System.out.println("Caminhão:  ");
        super.exibirDados();
        System.out.println("Capacidade: " + getCapacidadeCarga());
        System.out.println("Numero Eixos: " + getNumeroEixos());
    }





}
