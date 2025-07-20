public class Pessoa {
    private Contato[] contatos;
    private String nome;
    private int max;
    private int cont;

    public Pessoa(String nome, int max) {
        this.nome = nome;
        this.max = max;
        this.cont = 0;
        this.contatos = new Contato[max];
    }

    public void adicionarContato(Contato c) {
        if (cont < max) {
            contatos[cont++] = c;
        }
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public Contato[] getContatos(String tipo) {
        int qtd = 0;
        for (int i = 0; i < cont; i++) {
            if (contatos[i].getTipo().equalsIgnoreCase(tipo)) {
                qtd++;
            }
        }

        Contato[] filtrados = new Contato[qtd];
        int idx = 0;
        for (int i = 0; i < cont; i++) {
            if (contatos[i].getTipo().equalsIgnoreCase(tipo)) {
                filtrados[idx++] = contatos[i];
            }
        }
        return filtrados;
    }

    public boolean possuiEmail() {
        for (int i = 0; i < cont; i++) {
            if (contatos[i] instanceof Email) {
                return true;
            }
        }
        return false;
    }

    public boolean possuiTelefone() {
        for (int i = 0; i < cont; i++) {
            if (contatos[i] instanceof Telefone) {
                return true;
            }
        }
        return false;
    }

    public void exibirContatos() {
        System.out.println("Nome: " + nome);
        for (int i = 0; i < cont; i++) {
            contatos[i].exibir();
        }
    }

    public String getNome() {
        return nome;
    }
}
