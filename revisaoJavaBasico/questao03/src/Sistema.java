import java.util.Scanner;

public class Sistema {
    Scanner input = new Scanner(System.in);
    Cliente[] cliente = new Cliente[100];

    int count = 0;
    int option;
    public void menu (){
        String menu =
                "1 - Cadastrar-se \n" +
                "2 - Sacar\n" +
                "3 - Depositar\n" +
                "4 - Transferir\n" +
                "5 - Ver dados da Conta\n"+
                "0 - Sair\n";

        System.out.println(menu);
        System.out.println("Escolha uma opção acima: ");
        option = Integer.parseInt(input.nextLine());

    }

    public void sistema(){
        do{
            menu();

            switch (option){
                case 1:
                    System.out.println("Digite o seu nome: ");
                    String nome = input.nextLine();

                    String numero = String.valueOf(count);
                    String numeroConta = "CLIENTE0" + numero;

                    System.out.println("Crie uma senha: ");
                    String senha = input.nextLine();

                    cliente[count] = new Cliente(nome, numeroConta, senha, 0, 0);
                    System.out.println("Você foi cadastrado com sucesso! o numero da sua conta é: "+ cliente[count].getNumeroConta());

                    count++;
                    break;

                case 2:
                    System.out.println("Digite o numero da sua conta: ");
                    String contaDesejada = input.nextLine();

                    int contaSaque = 0;
                    boolean contaSaqueExiste = false;
                    for (int i = 0; i < count; i ++){
                        if (contaDesejada.equals(cliente[i].getNumeroConta())){
                            contaSaque = i;
                            contaSaqueExiste = true;
                        }
                    }
                    if(contaSaqueExiste) {
                        System.out.println("Digite sua senha: ");
                        String testeSenha = input.nextLine();

                        if (cliente[contaSaque].SenhaValida(testeSenha)) {

                            System.out.println("Qual valor deseja sacar:    ");
                            double valorDesejado = Double.parseDouble(input.nextLine());

                            cliente[contaSaque].sacar(valorDesejado);

                        } else {
                            System.out.println("Senha Incorreta! tente novamente...");
                        }
                    }
                    else if(!contaSaqueExiste) {
                        System.out.println("Conta não encontrada, verifique se digitou corretamente o número da conta!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o numero da conta que deseja depositar: ");
                    String numeroDesejado = input.nextLine();

                    int contaDeposito = 0;
                    boolean encontrado = false;
                    for (int i = 0; i < count; i ++){
                        if(numeroDesejado.equals(cliente[i].getNumeroConta())){
                            contaDeposito = i;
                            encontrado = true;
                        }
                    }

                    if(encontrado) {
                        System.out.println("Você está depositando para: " + cliente[contaDeposito].getNome());
                        System.out.println("Que valor deseja depositar:  ");
                        double valorDesejado = Double.parseDouble(input.nextLine());

                        cliente[contaDeposito].depositar(valorDesejado);
                    }
                    else if(!encontrado) {
                        System.out.println("Conta não encontrada, verifique se digitou corretamente o número da conta!");
                    }
                    break;

                case 4:
                    System.out.println("Digite o numero da sua conta:   ");
                    String numeroContaOrigem = input.nextLine();

                    int numeroOrigemTeste = 0;
                    boolean contaOrigemExiste = false;

                    for (int i = 0; i < count; i ++) {
                        if (numeroContaOrigem.equals(cliente[i].getNumeroConta())) {
                            numeroOrigemTeste = i;
                            contaOrigemExiste = true;
                        }
                    }
                    boolean senhaOrigemVerificada = false;
                    if(contaOrigemExiste) {
                        System.out.println("Digite sua senha: ");
                        String senhaOrigem = input.nextLine();

                        if (cliente[numeroOrigemTeste].SenhaValida(senhaOrigem)){
                            senhaOrigemVerificada = true;
                        }
                    }
                    else if(!contaOrigemExiste) {
                        System.out.println("Conta não encontrada, verifique se digitou corretamente o número da conta!");
                    }

                        System.out.println("Digite o número da conta para quem deseja transferir: ");
                        String numeroContaDestino = input.nextLine();

                        int numeroDestinoTeste = 0;
                        boolean contaDestinoExiste = false;

                        for (int j = 0; j < count; j ++) {
                            if (numeroContaDestino.equals(cliente[j].getNumeroConta())) {
                                numeroDestinoTeste = j;
                                contaDestinoExiste = true;
                            }
                        }

                        if(contaDestinoExiste) {

                            System.out.println("Digite o valor que deseja transferir:  ");
                            double valorTransferencia = Double.parseDouble(input.nextLine());

                            cliente[numeroOrigemTeste].transferir(cliente[numeroDestinoTeste], valorTransferencia);
                        }
                        else if(!contaDestinoExiste) {
                            System.out.println("Conta não encontrada, verifique se digitou corretamente o número da conta!");
                        }
                        break;
                case 5:
                    System.out.println("Digite o numero da sua conta: ");
                    String numeroSuaConta = input.nextLine();

                    int numSuaConta = 0;
                    boolean suaContaExiste = false;
                    for (int i = 0; i < count; i ++){
                        if (numeroSuaConta.equals(cliente[i].getNumeroConta())){
                            numSuaConta = i;
                            suaContaExiste = true;
                        }
                    }
                    if(suaContaExiste) {
                        System.out.println("Digite sua senha: ");
                        String testeSuaSenha = input.nextLine();

                        if (cliente[numSuaConta].SenhaValida(testeSuaSenha)) {

                            cliente[numSuaConta].visualizarDados();

                        } else {
                            System.out.println("Senha Incorreta! tente novamente...");
                        }
                    }
                    else if(!suaContaExiste) {
                        System.out.println("Conta não encontrada, verifique se digitou corretamente o número da conta!");
                    }

                    break;

                case 0:
                    System.out.println("** Saindo do Sistema **");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!!!");
                    break;
            }
        }
        while(option != 0);

    }




}
