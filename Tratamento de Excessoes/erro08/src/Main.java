class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(){
        super("\n\nSaldo insuficiente, tente outro valor dentro do orçamento...");
    }
}

class ContaBancaria {
    public double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{

        if(valor > saldo){
            throw new SaldoInsuficienteException();
        }
        else{
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        }
    }

}

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        ContaBancaria conta2 = new ContaBancaria(1000);

        try{
            conta.sacar(500);
            conta2.sacar(1500);
        }
        catch(SaldoInsuficienteException saldoInsuficienteException){
            System.out.println("Erro! " + saldoInsuficienteException);
        }
    }

}