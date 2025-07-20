import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        ClienteBanco cliente1 = new ClienteBanco();
        ClienteBanco cliente2 = new ClienteBanco();

        cliente1.setNome("Luis Eduardo Silva Soares");
        cliente1.setNumeroConta("192673BB");
        cliente1.setSaldo(5000);

        cliente2.setNome("Renan Piedro Alves Soares");
        cliente2.setNumeroConta("123456BB");
        cliente2.setSaldo(1516);



        int option;

        do{
            System.out.println("=========================== BANCO ===========================");
            System.out.println("1 - Sacar;");
            System.out.println("2 - Depositar;");
            System.out.println("3 - Ver dados;");
            System.out.println("4 - Sair");
            System.out.print("ESCOLHA UMA OPÇÃO ACIMA:    ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    
                    System.out.println("1 - NOME: "+ cliente1.getNome());
                    System.out.println("2 - NOME: "+ cliente2.getNome());
                    System.out.print("Com qual cliente deseja realizar o saque:    ");
                    int clienteSaque = input.nextInt();
                    input.nextLine();

                    if (clienteSaque == 1 || clienteSaque == 2) {
                        System.out.print("INSIRA O VALOR DO SAQUE:    ");
                        double valorSaque = input.nextDouble();
                        input.nextLine();

                        if (clienteSaque == 1) {
                            cliente1.sacar(valorSaque);
                        } else{
                            cliente2.sacar(valorSaque);
                        }


                    } else{
                        System.out.println("Cliente inválido!");
                    }

                    
                    break;

                case 2:
                    System.out.println("1 - NOME: "+ cliente1.getNome());
                    System.out.println("2 - NOME: "+ cliente2.getNome());
                    System.out.print("Com qual cliente deseja realizar o depósito:    ");
                    int clienteDeposito = input.nextInt();
                    input.nextLine();

                    if (clienteDeposito == 1 || clienteDeposito == 2) {
                        System.out.print("INSIRA O VALOR DO DEPÓSITO:    ");
                        double valorDeposito = input.nextDouble();
                        input.nextLine();

                        if (clienteDeposito == 1) {
                            cliente1.depositar(valorDeposito);
                        } else{
                            cliente2.depositar(valorDeposito);
                        }


                    } else{
                        System.out.println("Cliente inválido!");
                    }

                    break;

                case 3:
                    System.out.println("1 - NOME: "+ cliente1.getNome());
                    System.out.println("2 - NOME: "+ cliente2.getNome());
                    System.out.print("Qual cliente deseja consultar os dados:    ");
                    int clienteDados = input.nextInt();
                    input.nextLine();

                    if (clienteDados == 1 || clienteDados == 2) {

                        if (clienteDados == 1) {
                            System.out.println("=============================================================");
                            System.out.println("NOME: "+cliente1.getNome());
                            System.out.println("NÚMERO DA CONTA: "+ cliente1.getNumeroConta());
                            System.out.println("SALDO ATUAL: " + cliente1.getSaldo());
                        } else{
                            System.out.println("=============================================================");
                            System.out.println("NOME: "+cliente2.getNome());
                            System.out.println("NÚMERO DA CONTA: "+ cliente2.getNumeroConta());
                            System.out.println("SALDO ATUAL: " + cliente2.getSaldo());
                        }


                    } else{
                        System.out.println("Cliente inválido!");
                    }

                    break;

                case 0:
                    System.out.println("ENCERRANDO PROGRAMA...");
                    break;
            
                default:
                    System.out.println("OPÇÃO INVÁLIDA!!!");

                    break;
            }
        }
        while(option != 0);
    }
}
