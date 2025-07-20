public abstract class ED {
    protected int[] elementos;
    protected int tamanho;
    protected int atual;

    public ED(int tamanho){
        this.tamanho = tamanho;
        elementos = new int[tamanho];
        this.atual = 0;

    }

    public abstract void adicionar(int elemento);

    public abstract int remover();




}
