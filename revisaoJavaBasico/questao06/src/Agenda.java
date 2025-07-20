import java.util.Scanner;


public class Agenda {
    int option;
    Scanner input = new Scanner(System.in);
    Contato[] agenda = new Contato[100];
    int count = 0;

    public void menu(){
        String menu =
                "\n\n1 - Adicionar Contato\n"+
                "2 - Remover Contato\n" +
                "3 - Buscar pelo Nome\n"+
                "0 - Sair\n" +
                "Escolha uma opção acima:";
        System.out.println(menu);
        option = Integer.parseInt(input.nextLine());
    }

    public void sistemaAgenda(){
        do{
            menu();

            switch (option){
                case 1:
                    adicionarContato();
                    break;

                case 2:
                    removerContato();
                    break;

                case 3:
                    buscarContato();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("**Opção Inválida**");
                    break;


            }

        } while (option != 0);
    }


    public void adicionarContato(){
        System.out.println("Digite o nome do contato: ");
        String nome = input.nextLine();

        System.out.println("Digite o telefone do contato: ");
        String telefone = input.nextLine();

        agenda[count] = new Contato(nome, telefone);
        count++;
    }

    public void removerContato() {

        if (count == 0) {
            System.out.println("Lista de contatos vazia");
        } else {

            System.out.println("Digite o nome do contato que deseja REMOVER: ");
            String nomeRemovido = input.nextLine();


            int localizacaoContato = 0;
            boolean localizado = false;
            for (int i = 0; i < count; i++) {
                if (agenda[i].getNome().equalsIgnoreCase(nomeRemovido)) {
                    localizado = true;
                    localizacaoContato = i;
                    System.out.println("O contato que deseja REMOVER é: " + agenda[localizacaoContato].getNome() + "      Numero: " + agenda[localizacaoContato].getTelefone());
                    System.out.println("1 - CONFIRMAR");
                    System.out.println("2 - CANCELAR");
                    int confirmacao = Integer.parseInt(input.nextLine());

                    switch (confirmacao) {
                        case 1:
                            int j = localizacaoContato;
                                while (j < count -1) {
                                agenda[j] = agenda[j + 1];
                                j++;
                            }
                            agenda[count] = null;
                            count -= 1;
                            System.out.println("Contato removido com sucesso!");
                            break;

                        case 2:
                            System.out.println("** CANCELADO **");
                            break;

                        default:
                            System.out.println("ERRO!!! **OPÇÃO INVÁLIDA**");
                            break;
                    }

                }
            }

            if (!localizado) {
                System.out.println("Contato não encontrado!");
            }


        }
    }


    public void buscarContato() {
        if (count == 0) {
            System.out.println("Lista de contatos vazia");
        } else {
            System.out.println("Digite o nome do contato: ");
            String nome = input.nextLine();


            boolean localizado = false;
            for (int i = 0; i < count; i++) {
                if (agenda[i].getNome().equalsIgnoreCase(nome)) {
                    System.out.println("Nome do contato: " + agenda[i].getNome());
                    System.out.println("Telefone do contato: " + agenda[i].getTelefone());
                    localizado = true;
                }
            }

            if (!localizado) {
                System.out.println("Contato não localizado!");
            }
        }
    }



}
