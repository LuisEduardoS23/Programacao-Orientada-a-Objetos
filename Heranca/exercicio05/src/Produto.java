abstract class Produto {

    private String descricao;
    private double valor;
    private double imposto;


    public Produto(String descricao, double valor, double imposto) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }


    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
     }

     public void setValor(double valor){
        this.valor = valor;
     }

     public void setImposto(double imposto){
        this.imposto = imposto;
     }

    abstract double valorFinal();




}
