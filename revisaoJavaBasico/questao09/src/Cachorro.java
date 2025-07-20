public class Cachorro extends Animal implements Movimentavel{

    public Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("Som: AU! AU! AU!");
    }

    @Override
    public void mover(){
        System.out.println("O cachorro está correndo!");
    }



}
