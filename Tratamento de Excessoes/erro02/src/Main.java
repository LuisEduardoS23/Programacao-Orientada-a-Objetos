import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuarLoop = true;

        do{
            try {

                System.out.print("\nDigite sua idade:    ");
                int idade = input.nextInt();

                continuarLoop = false;
                System.out.println("\nSua idade é: " + idade);

            }
            catch(InputMismatchException inputMismatchException){
                System.out.println("Erro! tipo: " + inputMismatchException);
                System.out.println("Insira um dado do tipo inteiro para a idade!");

                input.nextLine();

            }

        } while (continuarLoop);

    }
}