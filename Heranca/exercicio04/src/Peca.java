public class Peca {
    private String nome;
    private float custo;
    private float lucro;

    public Peca(){
        this.nome = "";
        this.custo = 0;
        this.lucro = 0;
    }

    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getLucro(){
        return lucro;
    }

    public void setLucro(float lucro){
        this.lucro = lucro;
    }

    public float calcularPreco(){
        return custo + lucro;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("Lucro: " + lucro);
        System.out.println("Preco: " + calcularPreco());
    }
}
