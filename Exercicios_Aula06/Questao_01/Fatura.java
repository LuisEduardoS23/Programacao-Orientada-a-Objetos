public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    //SETTERS

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //GETTERS

    public String getNumero(){
        return numero;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPreco(){
        return preco;
    }


    public double getTotalFatura(){
        if (preco < 0 ) {
            preco = 0;
        }

        if (quantidade < 0){
            quantidade = 0;
        }
        return quantidade * preco;
    }
    
}
