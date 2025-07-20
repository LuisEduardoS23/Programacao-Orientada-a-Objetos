import java.util.ArrayList;

public class Lista{
    private int tamanho;
    private ArrayList<Object> elementos;
    
    //inicializar
    public void setInicializaLista(int tamanho){
        this.elementos = new ArrayList<>();
        this.tamanho = tamanho;
    }
    
    public ArrayList<Object> getElementos(){
        return elementos;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    public void imprimir(){
        for(int i = 0; i < tamanho; i++){
            System.out.println(elementos.get(i));
        }
    }
    
    //Verifica se vazia
    public boolean seVazia(){
        return elementos.isEmpty();
        
    }
    
    //verifica se a lista está cheia
    public boolean seCheia(){
        return elementos.size() == tamanho;
    }
    
    //adixionar um elemento
    
    public void adicionar(Object elemento){
        if(seCheia()){
            System.out.println("Não foi possível adicionar elementos, lista está cheia");
            
        }else{
            elementos.add(elemento);
        }
    }
    
    public Object recuperar(int indice){
        if(indice <= elementos.size()){
            System.out.printf("-> Elemento do índice %d: " + indice);
            System.out.println(elementos.get(indice));
            return elementos.get(indice);
        }else{
            System.out.println("Índice inválido");
            return null;
        }
    }
    
    //remover
    
    public void remover(int indice){
        if(indice <= elementos.size()){
            elementos.remove(indice);
        }else{
            System.out.println("\n* Índice inválido *");
        }
    }
    
}