public class Caminhão extends Veiculo{
    private double capacidade ;
    private int eixos;

public Caminhão(String placa, String marca, String modelo, int ano,double capacidade,int eixos) {
    super(placa, marca, modelo, ano);
    this.capacidade = capacidade ; 
    this.eixos = eixos ; 
        
}

@Override
public void exibirDados() {
        System.out.println("Informações do Caminhão: ");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Eixos: " + getEixos());

}

public double getCapacidade(){
    return capacidade ; 
}
public double getEixos(){
    return eixos ; 
}
}
