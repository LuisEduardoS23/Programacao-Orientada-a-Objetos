public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setIdade(int idade, String cpf){
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: " + nome + "\nIdade " + idade + "\nCPF " + cpf + "\n\n");
    }





}
