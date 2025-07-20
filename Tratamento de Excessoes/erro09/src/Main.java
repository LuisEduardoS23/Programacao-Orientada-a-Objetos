import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean continuar = true;

        do {
            try {
                System.out.print("Digite um número: ");
                int numero = input.nextInt();

                System.out.print("\nDigite um segundo número: ");
                int numero2 = input.nextInt();

                int divisao = numero / numero2;

                System.out.println("\nResultado da divisão: " + divisao);
                continuar = false;


            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Erro! " + inputMismatchException);
                System.out.println("Entrada inválida! Por favor, digite um número.");
                input.nextLine();

            } catch (ArithmeticException arithmeticException) {
                System.out.println("Erro! " + arithmeticException);
                System.out.println("Impossível dividir por 0, tente novamente com outro valor.");
            }
        } while (continuar);
    }
}
