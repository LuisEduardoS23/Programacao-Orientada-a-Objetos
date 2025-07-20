
import java.awt.im.InputContext;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        Academia aluno1 = new Academia();
        aluno1.setNome("Luis Eduardo Silva Soares");
        aluno1.setAltura(1.91f);
        aluno1.setIdade(16);
        aluno1.setPeso(80);

        Academia aluno2 = new Academia();
        aluno2.setNome("José Maria de Jesus Pereira");
        aluno2.setAltura(1.55f);
        aluno2.setIdade(95);
        aluno2.setPeso(76);

        int option;

        do{
        System.out.println("======================== SISTEMA DA ACADEMIA ========================");

        System.out.println("1 - Aluno: "+ aluno1.getNome());
        System.out.println("2 - Aluno: "+ aluno2.getNome());
        System.out.println("0 - Sair.");
        System.out.print("Qual aluno deseja ver os dados:     ");
        option = input.nextInt();
        input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("Nome: "+ aluno1.getNome() + "       Idade: "+aluno1.getIdade()+ " anos.");
                    System.out.println("Peso: " + aluno1.getPeso() + "      Altura: " + aluno1.getAltura()+ "m       IMC: " + aluno1.imc());
                    if (aluno1.isMenor()) {
                        System.out.println("Tem direito a desconto: SIM.");
                    } else{
                        System.out.println("Tem direito a desconto: NÃO.");
                    }
                    break;

                case 2:
                    System.out.println("=============================================");
                    System.out.println("Nome: "+ aluno2.getNome() + "       Idade: "+aluno2.getIdade()+ " anos.");
                    System.out.println("Peso: " + aluno2.getPeso() + "      Altura: " + aluno2.getAltura()+ "       IMC: " + aluno2.imc());
                    if (aluno2.isMenor()) {
                        System.out.println("Tem direito a desconto: SIM.");
                    } else{
                        System.out.println("Tem direito a desconto: NÃO.");
                    }
                    break;
                
                case 0:
                    System.out.println("ENCERRANDO PROGAMA...");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!!!!");
                    break;
            }
        }
        while(option != 0);
    }
}
