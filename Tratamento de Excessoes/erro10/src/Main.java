import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e);
            System.out.println("Detalhes técnicos do erro:");
            e.printStackTrace();

        }
    }
}
