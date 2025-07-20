import java.util.ArrayList;
import java.util.List ; 

public class Frota{
    private List<Veiculo> veiculos ; 

    public Frota(){
        veiculos = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado na frota.");
        } else {
            for (Veiculo v : veiculos) {
                v.exibirDados();
                System.out.println("-------------------------");
            }
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }


    
    
}
