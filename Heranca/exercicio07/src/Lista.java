import java.util.ArrayList;

public class Lista {
    protected ArrayList<Integer> lista;

    public Lista() {
    lista = new ArrayList<>();
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void inserirNumero(int numero){
        lista.add(numero);
    }

    public void removerNumero(int numero){
        lista.remove(numero);
    }

    public int numElementos(){
        return lista.size();
    }

    public int mostrarElemento(int posicao){
        return lista.get(posicao);
    }

    public void imprimirLista(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

}
