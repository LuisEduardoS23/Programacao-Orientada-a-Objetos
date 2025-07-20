import java.io.IOException;

public class Main {

        public static void leituraArquivo() throws IOException {
            throw new IOException();
        }

        public static void main(String[] args) {

        try{
            leituraArquivo();
        }
        catch(IOException ioException){
            System.out.println("Erro! " + ioException);
            System.out.println("Ocorreu um problema ao tentar ler arquivo...");
        }

    }
}