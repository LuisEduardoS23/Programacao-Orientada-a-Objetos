public class Pato extends Animal implements Movimentavel{

    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Som: QUACK! QUACK! QUACK!");
    }

    @Override
    public void mover(){
        System.out.println("O pato está voando!");
    }

}
