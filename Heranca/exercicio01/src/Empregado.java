abstract class Empregado {

    private String nome;
    private String cpf;


public Empregado(String nome, String cpf) {

    this.nome = nome;
    this.cpf = cpf;
}

public void setNome(String nome){
    this.nome = nome;
}

public void setCPF(String cpf){
    this.cpf = cpf;
}

public String getNome(){
    return nome;
}

public String getCPF(){
    return cpf;
}

public abstract double calcularSalario();





}