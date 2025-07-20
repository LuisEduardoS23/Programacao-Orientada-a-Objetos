public class Empregado {
    
    private String nome;
    private String sobrenome;
    private double salario;


    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public double getSalario(){
        return salario;
    }



    public void aumentoSalarial(){
        salario = salario + (salario * 0.1);

    }

    public double salarioAnual(){
        return salario * 12;
    }


}
