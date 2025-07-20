import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        ArrayList<Estadual> produtosEstaduais = new ArrayList<>();
        ArrayList<Nacional> produtosNacionais = new ArrayList<>();
        ArrayList<Importado> produtosImportados = new ArrayList<>();

        int option;
        do {
            System.out.println("1 – Cadastrar Produto Estadual \n" +
                    "2 – Cadastrar Produto Nacional \n" +
                    "3 – Cadastrar Produto Importado \n" +
                    "4 – Exibir Produtos Estaduais \n" +
                    "5 – Exibir Produtos Nacionais \n" +
                    "6 – Exibir Produtos Importados \n" +
                    "7 – Exibir Todos Produtos \n" +
                    "0 – SAIR");
            System.out.println("Escolha uma opção acima:    ");
            option = Integer.parseInt(Input.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Insira a descrição do produto Estadual:     ");
                    String descricao = Input.nextLine();
                    System.out.println("Insira o valor do produto Estadual:     ");
                    double valor = Double.parseDouble(Input.nextLine());

                    produtosEstaduais.add(new Estadual(descricao, valor));
                    break;
                }
                case 2:{
                    System.out.println("Insira a descrição do produto Nacional:     ");
                    String descricao = Input.nextLine();
                    System.out.println("Insira o valor do produto Nacional:     ");
                    double valor = Double.parseDouble(Input.nextLine());

                    produtosNacionais.add(new Nacional(descricao, valor));
                    break;
                }
                case 3: {
                    System.out.println("Insira a descrição do produto Importado:     ");
                    String descricao = Input.nextLine();
                    System.out.println("Insira o valor do produto Importado:     ");
                    double valor = Double.parseDouble(Input.nextLine());

                    produtosImportados.add(new Importado(descricao, valor));
                    break;
                }
                case 4:
                    for (int i = 0; i < produtosEstaduais.size(); i++) {
                        System.out.println("Produto:    " + produtosEstaduais.get(i).getDescricao() + "         Valor:" + produtosEstaduais.get(i).valorFinal());
                    }
                    break;

                case 5:
                    for (int i = 0; i < produtosNacionais.size(); i++) {
                        System.out.println("Produto:    " + produtosNacionais.get(i).getDescricao() + "         Valor:" + produtosNacionais.get(i).valorFinal());
                    }
                    break;

                case 6:
                    for (int i = 0; i < produtosImportados.size(); i++) {
                        System.out.println("Produto:    " + produtosImportados.get(i).getDescricao() + "         Valor:" + produtosImportados.get(i).valorFinal());
                    }
                    break;

                case 7:
                    System.out.println("\n\nEstaduais:");
                    for (int i = 0; i < produtosEstaduais.size(); i++) {
                        System.out.println("Produto:    " + produtosEstaduais.get(i).getDescricao() + "         Valor:" + produtosEstaduais.get(i).valorFinal());
                    }
                    System.out.println("\n\nNacionais:");
                    for (int i = 0; i < produtosNacionais.size(); i++) {
                        System.out.println("Produto:    " + produtosNacionais.get(i).getDescricao() + "         Valor:" + produtosNacionais.get(i).valorFinal());
                    }
                    System.out.println("\n\nImportados:");
                    for (int i = 0; i < produtosImportados.size(); i++) {
                        System.out.println("Produto:    " + produtosImportados.get(i).getDescricao() + "         Valor:" + produtosImportados.get(i).valorFinal());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("* Opção Inválida! *");
                    break;

            }
        } while (option != 0);
    }
}