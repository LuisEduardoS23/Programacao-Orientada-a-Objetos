public class Carro extends Veiculo implements Alugavel {
    private int numPorta;
    

public Carro(String placa , String marca , String modelo, int ano,int numPorta){
     super(placa , marca , modelo , ano);
     this.numPorta = numPorta ; 
}

@Override
public void calcularAluguel(int dia) {
    String textoDia = dia == 1 ? "dia" : "dias";
    double valorACarro= 120.00;
    double valorTotal = valorACarro * dia ; 
    System.out.println(getMarca() + " " + getModelo() + " (" + getAno() + ")" + "-" +"Valor para " + dia + " " + textoDia + " é de " + valorTotal);
}
    



@Override
public void exibirDados() {
        System.out.println("Informações do Carro: ");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Número de portas: " + numPorta);
}


public int getNumPorta(){
    return numPorta ; 
}


    
}
