public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();

    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
