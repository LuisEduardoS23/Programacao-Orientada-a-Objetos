package model;


public class Cliente {
    private String nome;
    private double saldo;

    public Cliente (String nome, double saldoInicial){

        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome(){
        return  nome;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public void depositar (double valor){
        if (valor > 0) {
            saldo += valor;

            System.out.println("Deposito no valor de R$ "+ valor + " realizado com sucesso!");
        }
        else{
            System.out.println("Erro! Valor invalido para deposito.");
        }
    }

    public void sacar (double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;

            System.out.println("Saque no valor de R$ "+ valor + " realizado com sucesso.");
        }
        else{
            System.out.println("Erro! Valor invalido para saque ou saldo insuficiente.");
        }
    }

    public void transferir (Cliente destino, double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;

            destino.depositar(valor);
            
            System.out.println("Tranferencia de R$"+ valor +"para" + destino.getNome() + "realizada com sucesso");
        }
        else{
            System.out.println("Tranferencia nao foi realizada! Verifique o saldo ou o valor.");
        }
    }

    public void mostrarSaldo(){
        System.out.println("nome: " + nome + "      Saldo atual: R$ " + saldo);
    }





}

