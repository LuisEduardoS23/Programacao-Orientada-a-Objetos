class EmpregadoComissionado extends Empregado{

    private double totalVendas;
    private float percentualComissao;


    public EmpregadoComissionado(String nome, String cpf, double vendas, float percentual){
        super(nome, cpf);
        this.totalVendas = vendas;
        this.percentualComissao = percentual;
    }

    public void setTotalVendas(float vendas){
        this.totalVendas = vendas;
    }

    public void setPercentualComissao(float percentual){
        this.percentualComissao = percentual;
    }

    public double getTotalVendas(){
        return totalVendas;
    }

    public float getPercentualComissao(){
        return percentualComissao;
    }

    @Override
    public double calcularSalario(){
        return totalVendas * percentualComissao;
    }





}
