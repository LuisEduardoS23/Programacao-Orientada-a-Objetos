public class Main {
    public static void main(String[] args) {

        Peca peca1 = new Peca("Arduino UNO", 50.75f, 10.0f);
        Peca peca2 = new PecaImportada("Notebook Acer Aspire 5", 3499.99f, 500.0f, 150.99f, 50.99f);

        peca1.exibir();
        System.out.println("\n\n");
        peca2.exibir();

    }

}