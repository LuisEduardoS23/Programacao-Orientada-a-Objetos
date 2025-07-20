import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[100];
        int count = 0;
        Scanner input = new Scanner(System.in);
    int option;
    do {
        System.out.println("1 - Cadastrar novo aluno");
        System.out.println("2 - Mostrar alunos");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção acima: ");
        option = Integer.parseInt(input.nextLine());


        switch (option) {
            case 1:
                System.out.println("Digite o nome do aluno: ");
                String nomeAluno = input.nextLine();

                System.out.println("Digite a matricula do aluno:");
                String matricula = input.nextLine();

                System.out.println("Digite o valor da 1 nota do aluno: ");
                double nota1 = Double.parseDouble(input.nextLine());

                System.out.println("Digite o valor da 2 nota do aluno: ");
                double nota2 = Double.parseDouble(input.nextLine());

                System.out.println("Digite o valor da 3 nota do aluno: ");
                double nota3 = Double.parseDouble(input.nextLine());

                alunos[count] = new Aluno(nomeAluno, matricula, nota1, nota2, nota3);
                count++;
                break;

            case 2:
                System.out.println("Dados de alunos cadastrados: ");
                for (int i = 0; i < count; i++) {
                    System.out.println("\n Nome do aluno: " + alunos[i].getNome());
                    System.out.println("Matricula do aluno: " + alunos[i].getMatricula());
                    System.out.println("Nota 1: " + alunos[i].getNota1());
                    System.out.println("Nota 2: " + alunos[i].getNota2());
                    System.out.println("Nota 3: " + alunos[i].getNota3());
                    System.out.println("Média: " + alunos[i].calcularMedia());
                    System.out.println("Aprovado: " + alunos[i].verificarAprovacao());
                    System.out.println("\n============================================\n");
                }
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    } while (option != 0);
    }
}