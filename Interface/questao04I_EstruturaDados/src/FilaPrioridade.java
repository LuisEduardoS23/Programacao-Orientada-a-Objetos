class FilaPrioridade extends Fila {

    public FilaPrioridade(int tamanho) {
        super(tamanho);
    }

    @Override
    public void adicionar(int elemento) {
        if (atual < tamanho) {
            int i = atual - 1;
            while (i >= 0 && elementos[(inicio + i) % tamanho] > elemento) {
                elementos[(inicio + i + 1) % tamanho] = elementos[(inicio + i) % tamanho];
                i--;
            }
            elementos[(inicio + i + 1) % tamanho] = elemento;
            atual++;
        } else {
            System.out.println("Fila com prioridade cheia!");
        }
    }
}
