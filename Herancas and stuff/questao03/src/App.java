public class App {

    public static void main(String[] args) {

        Carro carro1 = new Carro("AO72GSX", "Toyota", "Hilux", 2025, 5);
        Van van1 = new Van("PTO1013", "Mercedes", "Sprinter", 2023, 20);
        Caminhão caminhao1 = new Caminhão("DHG9361", "Volvo", "FH", 2017, 18, 4);



        frota.cadastrarVeiculo(carro1);
        frota.cadastrarVeiculo(van1);
        frota.cadastrarVeiculo(caminhao1);

        frota.listarVeiculos();
        System.out.println("Veículos que estão alugados:");
        carro1.calcularAluguel(2);
        van1.calcularAluguel(2);
    }
    
}
