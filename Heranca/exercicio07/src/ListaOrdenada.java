import java.util.Collections;

public class ListaOrdenada extends Lista {

    @Override
    public void inserirNumero(int numero) {
        lista.add(numero);
        Collections.sort(lista);
    }
    @Override
    public void imprimirLista() {
        System.out.println("Elementos da lista ordenada:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
