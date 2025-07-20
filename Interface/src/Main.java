public class Main {
    public static void main(String[] args) {

        Veiculos veiculo01 = new Carro("PTO2534", "Toyota", "Hilux", 2023, 4);
        Veiculos veiculo02 = new Van("BBB0022", "Mercedes", "Sprinter 417", 2022, 20);
        Veiculos veiculo03 = new Caminhao("LUNK020", "Scania", "Super", 2023, 12500, 16);

        Frota frota = new Frota();

        frota.cadastrarFrota(veiculo01);
        frota.cadastrarFrota(veiculo02);
        frota.cadastrarFrota(veiculo03);

        System.out.println("=== Veículos Cadastrados ===");
        frota.listarFrota();


        System.out.println("\n\n === Veículos Alugáveis (5 dias): ===\n");
        frota.listarAlugáveis(5);

    }
}