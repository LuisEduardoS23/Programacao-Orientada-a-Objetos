import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=-=-=-=-= Calculadora de Divisão =-=-=-=-=");
        boolean divisaoNaoConcluida = true;

        do{
            try {
                System.out.print("\nDigite o numerador da divisão:      ");
                int numerador = input.nextInt();
                System.out.print("\nDigite o denominador da divisão:      ");
                int denominador = Integer.parseInt(input.nextLine());

                int quociente = numerador / denominador;

                System.out.println("Quociente da divisão: " + quociente);

                divisaoNaoConcluida = false;
            }
            catch( ArithmeticException arithmeticException ) {
                System.out.println("Erro!!! " + arithmeticException);
                System.out.println("Impossível dividir por zero! Digite um inteiro diferente como denominador...");
            }

        } while(divisaoNaoConcluida);

    }
}