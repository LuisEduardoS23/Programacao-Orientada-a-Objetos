public class Principal{
    public static void main(String args[]){
        
        Lista lista1 = new Lista();
        
        lista1.setInicializaLista(5);
        
        //adicionando elementos
        
        lista1.adicionar(1);
        lista1.adicionar(2);
        lista1.adicionar(1);
        lista1.adicionar(2);
        lista1.adicionar(1);
        
        
        System.out.println("Lista:");
        lista1.imprimir();
        if(lista1.seVazia()){
            System.out.println("Lista vazia");
        }else{
            System.out.println("Lista contém elementos");
        }
        
        if(lista1.seCheia()){
            System.out.println("Lista cheia");
        }else{
            System.out.println("Lista contém elementos, mas não está cheia");
        }
        lista1.remover(2);
        
        System.out.println("Nova lista");
        lista1.imprimir();
        
        lista1.recuperar(1);
        lista1.imprimir();
    
        
    }
}