public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double n1, double n2, double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double n1) {
        this.notas[0] =n1;
    }

    public void setNota2(double n2) {
        this.notas[1] =n2;
    }

    public void setNota3(double n3) {
        this.notas[2] =n3;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        return notas[0];
    }


    public double getNota2() {
        return notas[1];
    }


    public double getNota3() {
        return notas[2];
    }

    public double calcularMedia() {
        return (notas[0] + notas[1] + notas[2]) /3;
    }

    public boolean verificarAprovacao() {
        if (calcularMedia() >= 7.0){
            return true;
        } else{
            return false;
        }
    }




}
