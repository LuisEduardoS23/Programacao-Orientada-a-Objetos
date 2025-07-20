public class Main {
    public static void main(String[] args) {
        ED estrutura;

        System.out.println("\nPilha:");
        estrutura = new Pilha(5);
        demonstrar(estrutura);

        System.out.println("============================================");
        System.out.println("\nFila:");
        estrutura = new Fila(5);
        demonstrar(estrutura);

        System.out.println("============================================");
        System.out.println("\nTeste com Fila com Prioridade:");
        estrutura = new FilaPrioridade(5);
        demonstrar(estrutura);
    }

    public static void demonstrar(ED estrutura) {
        int[] valores = {23, 2, 10, 5, 0};

        // Adicionando elementos
        for (int i = 0; i < valores.length; i++) {
            estrutura.adicionar(valores[i]);
        }

        // Imprimindo elementos antes de remover
        System.out.println("Estrutura atual (antes da remoção):");
        if (estrutura instanceof Pilha) {
            for (int i = estrutura.atual - 1; i >= 0; i--) {
                System.out.println(estrutura.elementos[i]);
            }
        }

        else if (estrutura instanceof Fila) {
            Fila fila = (Fila) estrutura;
            for (int i = 0; i < fila.atual; i++) {
                int index = (fila.inicio + i) % fila.tamanho;
                System.out.println(fila.elementos[index]);
            }
        }

        // Removendo elementos
        System.out.println("Removendo elementos:");
        while (estrutura.atual != 0) {
            int removido = estrutura.remover();
            System.out.println("Removido: " + removido);
        }

        // Mostrar estrutura com os intens removidos
        System.out.println("Estrutura atual (vazia):");
        if (estrutura instanceof Pilha) {
            for (int i = estrutura.atual - 1; i >= 0; i--) {
                System.out.println(estrutura.elementos[i]);
            }
        }

        else if (estrutura instanceof Fila) {
            Fila fila = (Fila) estrutura;
            for (int i = 0; i < fila.atual; i++) {
                int index = (fila.inicio + i) % fila.tamanho;
                System.out.println(fila.elementos[index]);
            }
        }
    }
}
