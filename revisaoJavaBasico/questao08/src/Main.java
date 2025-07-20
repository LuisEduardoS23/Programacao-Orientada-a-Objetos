public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[5];

        figuras[0] = new Retangulo(10, 45);
        figuras[1] = new Circulo(7);
        figuras[2] = new Circulo(19);
        figuras[3] = new Retangulo(5, 4);
        figuras[4] = new Circulo(25);

        figuras[0].exibir();
        figuras[1].exibir();
        figuras[2].exibir();
        figuras[3].exibir();
        figuras[4].exibir();


    }
}