public class Main{
    public static void main(String[] args) {
        System.out.println("=== Lista Comum ===");
        Lista lista = new Lista();
        lista.inserirNumero(5);
        lista.inserirNumero(2);
        lista.inserirNumero(8);
        lista.imprimirLista();
        System.out.println("Quantidade de elementos: " + lista.numElementos());
        System.out.println("Posição 2: " + lista.mostrarElemento(1));
        lista.removerNumero(2);
        lista.imprimirLista();

        System.out.println("\n=== Lista Ordenada ===");
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        listaOrdenada.inserirNumero(5);
        listaOrdenada.inserirNumero(2);
        listaOrdenada.inserirNumero(8);
        listaOrdenada.inserirNumero(1);
        listaOrdenada.imprimirLista();
        System.out.println("Quantidade de elementos: " + listaOrdenada.numElementos());
        System.out.println("Posição 2: " + listaOrdenada.mostrarElemento(2));
        listaOrdenada.removerNumero(5);
        listaOrdenada.imprimirLista();
    }
}