package view;
import java.util.Scanner;
import model.Cliente;

public class EntradaDados {

    public static Cliente criarCliente (Scanner input){

        System.out.print ("Digite o nome do cliente:   ");
        String nome = input.nextLine();

        System.out.print("Digite o saldo inicial do cliente:   ");
        double saldo = input.nextDouble();
        input.nextLine();

        return new Cliente(nome, saldo);

    }

}
