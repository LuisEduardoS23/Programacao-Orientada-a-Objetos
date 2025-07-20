import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animais = new ArrayList<>();

        Animal cachorro = new Cachorro("Scooby", 23);
        Animal pato = new Pato("Donald", 10);
        Animal peixe = new Peixe("Nemo", 4);

        animais.add(cachorro);
        animais.add(pato);
        animais.add(peixe);

        for (Animal a : animais) {
            a.exibirInfo();
            a.emitirSom();
            if (a instanceof Movimentavel) {
                ((Movimentavel)a).mover();
            }
        }

    }
}