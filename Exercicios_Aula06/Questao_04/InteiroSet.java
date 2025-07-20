public class InteiroSet {

    private boolean[] conjunto;

    private int TAM = 101; //1 a mais para ser de 0 a 100

    public InteiroSet(){
    conjunto = new boolean[TAM];
        for (int i = 0; i < TAM; i++){
            conjunto[i] = false;
        }

    }

    public void adicionar (int k){
        if (k>=0 && k<=TAM){
            conjunto[k] = true;
        }
    }

    public void remover (int m){
        if (m>=0 && m<=TAM){
            conjunto[m] = false;
        }
    }

    





}
