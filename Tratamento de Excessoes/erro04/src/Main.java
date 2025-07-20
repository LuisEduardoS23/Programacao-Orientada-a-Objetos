import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Scanner input = null;

        try {
            File arquivo = new File("arquivo.txt");
            input = new Scanner(arquivo);

            while (input.hasNextLine()) {
                String conteudo = input.nextLine();
                System.out.println("Dados lidos: " + conteudo);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Erro!" + fileNotFoundException);
            System.out.println("Arquivo não foi encontrado!");

        } finally {
            // Sempre será executado, mesmo que ocorra exceção
            System.out.println("Encerrando programa...");
            if (input != null) {
                input.close();
            }
        }
    }
}
