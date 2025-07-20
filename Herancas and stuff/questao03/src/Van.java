public class Van extends Veiculo implements Alugavel{
    private int capacidadeDepassageiros;

public Van(String placa, String marca, String modelo, int ano, int capacidadeDepassageiros) {
        super(placa, marca, modelo, ano);
        this.capacidadeDepassageiros = capacidadeDepassageiros ; 
        
}



@Override
public void exibirDados() {
     System.out.println("Informações do Caminhão: ");
     System.out.println("Placa: " + getPlaca());
     System.out.println("Marca: " + getMarca());
     System.out.println("Modelo: " + getModelo());
     System.out.println("Ano: " + getAno());
     System.out.println("Capacidade de passageiros: " + getCapacidadeDePassageiros());
}
@Override
public void calcularAluguel(int dia) {
     String textoDia = dia == 1 ? "dia" : "dias";
    double valorAVan = 180.00;
    double valorTotal = valorAVan * dia ; 
    System.out.println(getMarca() + " " + getModelo() + " (" + getAno() + ")" + "-"+ "Valor para " + dia + " " + textoDia + " é de " + valorTotal);
}

public int getCapacidadeDePassageiros(){
    return capacidadeDepassageiros ; 
}





}
