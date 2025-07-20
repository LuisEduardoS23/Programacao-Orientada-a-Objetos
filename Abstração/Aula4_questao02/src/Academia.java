public class Academia {

    private String nome;
    private int idade;
    private float peso;
    private float altura;

    //SETS
    public void setNome(String nome){
        this.nome = nome;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    public void setPeso (float peso){
        this.peso = peso;

    }

    public void setAltura (float altura){
        this.altura = altura;

    }

    //GETS
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public float getPeso(){
        return peso;
    }

    public float getAltura(){
        return altura;
    }

    public boolean isMenor(){
        if (idade < 18) {
            return true;
        } else{
            return false;
        }
    }

    public float imc(){
        float imc = (peso/(altura * altura));
        return imc;
    }

}
