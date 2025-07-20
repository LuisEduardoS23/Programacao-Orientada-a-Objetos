class EmpregadoComissionadoComBase extends EmpregadoComissionado{

    private double salarioBase;

    public EmpregadoComissionadoComBase(String nome, String cpf, double totalVendas, float percentual, double salarioBase){
        super(nome, cpf, totalVendas, percentual);
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double calcularSalario(){
        double comissao = super.calcularSalario();
        return comissao + salarioBase;
    }
}