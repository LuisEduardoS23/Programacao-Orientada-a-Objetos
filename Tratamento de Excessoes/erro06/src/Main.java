public class Main {

    public static void processar() throws Exception {
        try {
            throw new Exception("Erro durante o processamento.");
        } catch (Exception e) {
            System.out.println("Exceção capturada em processar(): " + e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            processar();
        } catch (Exception e) {
            System.out.println("Exceção capturada no main(): " + e);
        }

        System.out.println("Programa encerrado.");
    }
}
