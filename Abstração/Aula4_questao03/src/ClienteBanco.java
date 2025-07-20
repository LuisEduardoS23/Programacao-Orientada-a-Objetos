
public class ClienteBanco {

    private String numeroConta;
    private String nome;
    private double saldo;

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void sacar(double valor){
        if (valor <= saldo) {
            saldo-=valor;
            System.out.println("Saque no valor de R$"+valor+" realizado com sucesso. Saldo restante:"+saldo );
        } else{
            System.out.println("Valor inválido ou saldo insuficiente!");
        }
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito no valor de R$"+valor+" realizado com sucesso. Saldo atual:"+saldo );
        } else{
            System.out.println("Valor inválido para depósito!");
        }
    }
}
