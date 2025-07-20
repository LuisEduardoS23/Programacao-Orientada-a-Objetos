package app;
import model.Cliente;
import view.EntradaDados;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Criando cliente 1: ");
        Cliente cliente1 = EntradaDados.criarCliente(input);

        System.out.println("Criando cliente 2:");
        Cliente cliente2 = EntradaDados.criarCliente(input);

        System.out.println("Criando cliente 3");
        Cliente cliente3 = EntradaDados.criarCliente(input);

        int option;
        do { 
            System.out.println("\n===================== MENU =====================");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Tranferir");
            System.out.println("4 - Ver Saldo");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao acima:    ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                //DEPOSITO

                    System.out.print("Para qual cliente deseja transferir? (1, 2 ou 3)  ");
                    int clienteDeposito = input.nextInt();
                    input.nextLine();

                    System.out.println("Qual valor deseja depositar?    ");
                    double valorDeposito = input.nextDouble();
                    input.nextLine();

                    switch (clienteDeposito) {
                        case 1:
                            cliente1.depositar(valorDeposito);
                            break;

                        case 2:
                            cliente2.depositar(valorDeposito);
                            break;
                    
                        case 3:
                            cliente3.depositar(valorDeposito);
                        default:
                            System.out.println("Cliente invalido!");
                            break;
                    }

                    break;
                case 2:
                    //SAQUE

                    System.out.println("Deseja sacar de qual cliente? (1, 2 ou 3)   ");
                    int clienteSaque = input.nextInt();
                    input.nextLine();

                    System.out.println("Qual o valor de saque?     ");
                    double valorSaque = input.nextDouble();
                    input.nextLine();

                    switch (clienteSaque) {
                        case 1:
                            cliente1.sacar(valorSaque);
                            break;

                        case 2:
                            cliente2.sacar(valorSaque);
                            break;

                        case 3:
                            cliente3.sacar(valorSaque);
                            break;
                    
                        default:
                            System.out.println("Opcao invalida!");
                            break;
                    }
                    
                    break;

                case 3:
                    //TRANSFERENCIA

                    System.out.println("Deseja transferir de qual cliente? (1, 2 ou 3)   ");
                    int clienteOrigem = input.nextInt();
                    input.nextLine();

                    System.out.println("Para qual cliente? (1, 2 ou 3)   ");
                    int clienteDestino = input.nextInt();
                    input.nextLine();

                    System.out.println("Qual o valor da transferencia?     ");
                    double valorTranferencia = input.nextDouble();
                    input.nextLine();

                    switch (clienteOrigem) {
                        case 1:
                            if (clienteDestino == 2) {
                                cliente1.transferir(cliente2, valorTranferencia);
                            }

                            else if (clienteDestino == 3) {
                                cliente1.transferir(cliente3, valorTranferencia);
                            }
                            else{
                                System.out.println("Transferencia invalida!");
                            }
                            
                            break;

                        case 2:
                            if (clienteDestino == 1) {
                                cliente2.transferir(cliente1, valorTranferencia);
                            }

                            else if (clienteDestino == 3) {
                                cliente2.transferir(cliente3, valorTranferencia);
                            }
                            else{
                                System.out.println("Transferencia invalida!");
                            }
                            
                            break;

                        case 3:
                            if (clienteDestino == 1) {
                                cliente3.transferir(cliente1, valorTranferencia);
                            }

                            else if (clienteDestino == 2) {
                                cliente3.transferir(cliente2, valorTranferencia);
                            }
                            else{
                                System.out.println("Transferencia invalida!");
                            }
                            
                            break;
                    
                        default:
                        System.out.println("Opcao invalida!");

                            break;
                    }

                    break;

                case 4:
                    //VER SALDO
                    cliente1.mostrarSaldo();
                    cliente2.mostrarSaldo();
                    cliente3.mostrarSaldo();

                    break;

                case 0:
                   System.out.println("Saindo do sistema..."); 
                    
                    break;
            
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
        } 
        while (option != 0);

        input.close();

    }
}
