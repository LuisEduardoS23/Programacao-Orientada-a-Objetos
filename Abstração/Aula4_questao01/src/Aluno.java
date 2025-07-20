public class Aluno {

    private String nome;
    private String ra;
    private float t1;
    private float t2;
    private float p1;
    private float p2;


    public float calculaMedia(){
        float media = (t1 + t2 + p1 + p2)/4;
        return media;
    }

    public boolean aprovado(){

        if (calculaMedia() >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setRa(String ra){
        this.ra = ra;

    }

    public void setT1 (float t1){
        this.t1 = t1;

    }

    public void setT2 (float t2){
        this.t2 = t2;

    }

    public void setP1 (float p1){
        this.p1 = p1;

    }

    public void setP2(float p2){
        this.p2 = p2;

    }

    public String getNome(){
        return nome;

    }
    
    public String getRa(){
        return ra;

    }

    public float getT1(){
        return t1;

    }

    public float getT2(){
        return t2;

    }

    public float getP1(){
        return p1;

    }

    public float getP2(){
        return p2;

    }


}
