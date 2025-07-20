public class Aluno {

    private String nome;
    private String matricula;
    private float n1;
    private float n2;

    //CONSTRUTOR (COM MESMO NOME DA CLASSE)
    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.n1= 0;
        this.n2 = 0;
    }

    //CONSTRUTOR
    public Aluno(String nome, String matricula, float n1, float n2){
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
    }


    public float media(){
        return (n1 + n2)/2.0f;
    }

    public boolean aprovado(){
        if (media() >= 5){
            return true;
        } else{
            return false;
        }
    }


    public String getNome(){
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }

    public float getN1(){
        return n1;
    }

    public float getN2(){
        return n2;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setN1(float n1){
        this.n1 = n1;
    }

    public void setN2(float n2){
        this.n2 = n2;
    }



}
