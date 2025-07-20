import java.util.ArrayList;
import java.util.List;

public class Frota{
    private List<Veiculos> frota;

    public Frota(){
        frota = new ArrayList<Veiculos>();
    }

    public void cadastrarFrota(Veiculos veiculo){
        frota.add(veiculo);
        }


    public void listarFrota(){
        if(frota.isEmpty()){
            System.out.println("A frota está vazia, nenhum veículo cadastrado!");
        }

        else{

            System.out.println("===============================");
            int tamanho = frota.size();
                for(int i = 0; i < tamanho; i++){
                    frota.get(i).exibirDados();
                    System.out.println("===============================");
                }
        }
    }

    public void listarAlugáveis(int dias){
        int tamanho = frota.size();
        for (int i = 0; i < tamanho; i++) {
            if (frota.get(i) instanceof Alugado){
                ((Alugado) frota.get(i)).calcularValorAluguel(dias);
            }

        }
    }
}