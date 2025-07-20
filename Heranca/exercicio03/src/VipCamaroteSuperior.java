public class VipCamaroteSuperior extends IngressoVip{
    private double valorAdicionalSuperior;

    public VipCamaroteSuperior(double valor, double valorAdicional, double valorAdicionalSuperior) {
        super(valor, valorAdicional);
        this.valorAdicionalSuperior = valorAdicionalSuperior;
    }


    public double getValorCamaroteSuperior() {
        return (super.getValorAdicional() + super.getValor() + valorAdicionalSuperior);
    }

}
