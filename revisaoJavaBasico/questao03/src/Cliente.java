import java.util.Scanner;

public class Cliente {
    Scanner input = new Scanner(System.in);

    private String nome;
    private double saldoCorrente;
    private String senha;
    private String numeroConta;
    private double saldoPoupanca;


    public Cliente(String nome, String numeroConta , String senha,  double saldoCorrente, double saldoPoupanca){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldoCorrente = saldoCorrente;
        this.saldoPoupanca = saldoPoupanca;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldoCorrente(double saldoCorrente){
        this.saldoCorrente = saldoCorrente;
    }

    public void setSaldoPoupanca(double saldoPoupanca){
        this.saldoPoupanca = saldoPoupanca;
    }

    public String getNome(){
        return nome;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getSenha(){
        return senha;
    }

    public double getSaldoCorrente(){
        return saldoCorrente;
    }

    public double getSaldoPoupanca(){
        return saldoPoupanca;
    }

    public void depositar(double valor){

        if(valor > 0) {

            System.out.println("1 - Conta Poupança      R$ " + saldoPoupanca);
            System.out.println("2 - Conta Corrente      R$ " + saldoCorrente);
            System.out.println("Para qual tipo de conta deseja depositar?");
            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    saldoPoupanca += valor;
                    System.out.println("Valor depositado com sucesso!");
                    break;

                case 2:
                    saldoCorrente += valor;
                    System.out.println("Valor depositado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }



        } else{
            System.out.println("** Valor inválido para depósito **");
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            System.out.println("1 - Conta Poupança      R$ " + saldoPoupanca);
            System.out.println("2 - Conta Corrente      R$ " + saldoCorrente);
            System.out.println("De qual conta deseja sacar?");
            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    if(valor <= saldoPoupanca){
                        saldoPoupanca -= valor;
                        System.out.println("Valor sacado com sucesso!");
                    } else{
                        System.out.println("Saldo Insuficiente! valor solicitado: R$ " + valor + "      valor dispoível: R$ " + saldoPoupanca);
                    }
                    break;

                case 2:
                    if(valor <= saldoCorrente){
                        saldoCorrente -= valor;
                        System.out.println("Valor sacado com sucesso!");
                    } else{
                        System.out.println("Saldo Insuficiente! valor solicitado: R$ " + valor + "      valor dispoível: R$ " + saldoCorrente);
                    }
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }


        } else{
            System.out.println("** Valor Inválido para saque **");
        }
    }

    public void transferir(Cliente destino, double valor){
        if (valor > 0){
            System.out.println("1 - Conta Poupança      R$ " + saldoPoupanca);
            System.out.println("2 - Conta Corrente      R$ " + saldoCorrente);
            System.out.println("De qual conta deseja transferir?");
            int opcaoOrigem = Integer.parseInt(input.nextLine());

            System.out.println("\n\n1 - Conta Poupança");
            System.out.println("2 - Conta Corrente");
            System.out.println("Para qual tipo de conta deseja transferir?");
            int opcaoDestino = Integer.parseInt(input.nextLine());

            if (opcaoOrigem == 1){
                switch (opcaoDestino){
                    case 1:
                        saldoPoupanca -= valor;
                        saldoPoupanca += valor;
                        System.out.println("Valor transferido com sucesso!");
                        break;

                    case 2:
                        saldoPoupanca -= valor;
                        destino.saldoCorrente += valor;
                        System.out.println("Valor transferido com sucesso!");
                        break;

                    default:
                        System.out.println("Erro! opção inválida!");
                        break;
                }
            }
            else if(opcaoOrigem == 2){
                switch (opcaoDestino){
                    case 1:
                        saldoCorrente -= valor;
                        destino.saldoPoupanca += valor;
                        System.out.println("Valor transferido com sucesso!");
                        break;
                    case 2:
                        saldoCorrente -= valor;
                        destino.saldoCorrente += valor;
                        System.out.println("Valor transferido com sucesso!");
                        break;

                    default:
                        System.out.println("Erro opção inválida!");
                        break;
                }
            }
            else{
                System.out.println("Erro opção inválida!");
            }


        } else{
            System.out.println("** Valor Inválido para transferencia **");
        }
    }


    public void visualizarDados(){
        System.out.println("Nome: " + nome + "      Numero da Conta: " + numeroConta);
        System.out.println("Saldo da Conta Corrente: R$" + saldoCorrente);
        System.out.println("Saldo da Conta Poupança: R$" + saldoPoupanca);
    }

    public boolean SenhaValida(String senhaTestada){
        if (senhaTestada.equals(senha)){
            return true;
        } else{
            return false;
        }
    }







}
