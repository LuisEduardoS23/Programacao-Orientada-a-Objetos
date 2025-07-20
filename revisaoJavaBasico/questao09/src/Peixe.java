public class Peixe extends Animal implements Movimentavel{

    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Som: BOOP! BLUB! BOOP!");
    }

    @Override
    public void mover(){
        System.out.println("O peixe está nadando!");
    }
}
