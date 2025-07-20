class Pilha extends ED {

    public Pilha(int tamanho) {
        super(tamanho);
    }

    @Override
    public void adicionar(int elemento) {
        if (atual < tamanho) {
            elementos[atual] = elemento;
            atual++;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    @Override
    public int remover() {
        if (atual == 0) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        atual--;
        return elementos[atual];
    }
}

