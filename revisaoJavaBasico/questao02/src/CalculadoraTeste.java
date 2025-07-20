import java.util.Scanner;

public class CalculadoraTeste{

    public static void main (String[] args) throws Exception{

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o primeiro valor: ");
        double numero1 = Double.parseDouble(input.nextLine());

        System.out.println("Digite o segundo valor: ");
        double numero2 = Double.parseDouble(input.nextLine());

        Calculadora calc1 = new Calculadora(numero1, numero2);
        int opcao;

        do{
            System.out.println("\n\nSeus números são: " + calc1.getNum1()+"      "+ calc1.getNum2());
            System.out.println("============ OPERAÇÕES ============");
            System.out.println("1. Soma");
            System.out.println("2. Subtracao");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("5. Potencia");
            System.out.println("6. Mudar valores");
            System.out.println("0. Sair");
            System.out.println("Digite uma opção acima: ");
            opcao = Integer.parseInt(input.nextLine());

            switch(opcao){

                case 1:
                    System.out.println(calc1.getNum1()+" + " + calc1.getNum2()+" = " + calc1.somar());
                    break;

                case 2:
                    System.out.println(calc1.getNum1()+" - " + calc1.getNum2()+" = " + calc1.subtrair());
                    break;

                case 3:
                    System.out.println(calc1.getNum1()+" x " + calc1.getNum2()+" = " + calc1.multiplicar());
                    break;

                case 4:
                    System.out.println(calc1.getNum1()+" % " + calc1.getNum2()+" = " + calc1.dividir());
                    break;

                case 5:
                    System.out.println(calc1.getNum1()+" ^ " + calc1.getNum2()+" = " + calc1.potenciar());
                    break;

                case 6:
                    System.out.println("Qual o novo valor do primeiro numero: ");
                    double newNum1 = Double.parseDouble(input.nextLine());

                    System.out.println("Qual o novo valor do segundo numero: ");
                    double newNum2 = Double.parseDouble(input.nextLine());

                    calc1.setNum1(newNum1);
                    calc1.setNum2(newNum2);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("** Opção inválida! **");
                    break;

            }

        }
                while(opcao != 0);
        }

    }