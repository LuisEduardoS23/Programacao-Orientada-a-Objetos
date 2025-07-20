import java.util.Scanner;

public class PessoaTeste {

    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o nome da pessoa:    ");
            String nomepessoa = sc.nextLine();

            System.out.println("Digite a idade da pessoa:    ");
            int idadepessoa = Integer.parseInt(sc.nextLine());

            Pessoa pessoa1 = new Pessoa(nomepessoa, idadepessoa);

            System.out.println("Nome:    " + pessoa1.getNome()+"    Idade: " +pessoa1.getIdade());


    }



}