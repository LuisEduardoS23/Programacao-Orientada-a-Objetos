class Fila extends ED {
    protected int inicio;

    public Fila(int tamanho) {
        super(tamanho);
        this.inicio = 0;
    }

    @Override
    public void adicionar(int elemento) {
        if (atual < tamanho) {
            int fim = (inicio + atual) % tamanho;
            elementos[fim] = elemento;
            atual++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    @Override
    public int remover() {
        if (atual == 0) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int valor = elementos[inicio];
        inicio = (inicio + 1) % tamanho;
        atual--;
        return valor;
    }
}

