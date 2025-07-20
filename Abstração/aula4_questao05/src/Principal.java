import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Instituto instituto = criarInstituto(input);
        Departamento departamento = instituto.criarDepartamento(input);
        instituto.assDepto(departamento);

        System.out.print("Quantos funcionários deseja adicionar ao departamento? ");
        int quantidade = input.nextInt();
        input.nextLine();

        for (int i = 0; i < quantidade; i++) {
            Funcionario funcionario = Departamento.criarFuncionario(input);
            departamento.addFuncionarioDepartamento(funcionario);
        }

        input.close();
    }

    public static Instituto criarInstituto(Scanner input) {
        System.out.print("Insira o nome do instituto: ");
        String nome = input.nextLine();
        return new Instituto(nome);
    }
}
