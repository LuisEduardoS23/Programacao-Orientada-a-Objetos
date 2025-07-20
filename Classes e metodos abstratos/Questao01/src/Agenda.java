public class Agenda {
    private String proprietario;
    private Pessoa[] pessoas;
    private int max;
    private int cont;

    public Agenda(String proprietario, int max) {
        this.proprietario = proprietario;
        this.max = max;
        this.cont = 0;
        this.pessoas = new Pessoa[max];
    }

    public void addPessoa(Pessoa p) {
        if (cont < max) {
            pessoas[cont++] = p;
        }
    }

    public Pessoa buscarPessoa(String nome) {
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
                return pessoas[i];
            }
        }
        return null;
    }

    public void addContato(String nome, Contato c) {
        Pessoa p = buscarPessoa(nome);
        if (p != null) {
            p.adicionarContato(c);
        }
    }

    public void exibirTodasPessoas() {
        for (int i = 0; i < cont; i++) {
            pessoas[i].exibirContatos();
        }
    }

    public void exibirContatosPessoa(String nome) {
        Pessoa p = buscarPessoa(nome);
        if (p != null) {
            p.exibirContatos();
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void exibirPessoasComEmail() {
        for (int i = 0; i < cont; i++) {
            if (pessoas[i].possuiEmail()) {
                System.out.println(pessoas[i].getNome());
            }
        }
    }

    public void recuperarPessoaPorEmail(String email) {
        for (int i = 0; i < cont; i++) {
            Contato[] contatos = pessoas[i].getContatos("email");
            for (Contato c : contatos) {
                if (c instanceof Email && ((Email) c).getEmail().equalsIgnoreCase(email)) {
                    System.out.println(pessoas[i].getNome());
                    break;
                }
            }
        }
    }

    public void recuperarPessoaPorTelefone(String telefone) {
        for (int i = 0; i < cont; i++) {
            Contato[] contatos = pessoas[i].getContatos("telefone");
            for (Contato c : contatos) {
                if (c instanceof Telefone && ((Telefone) c).getTelefone().equalsIgnoreCase(telefone)) {
                    System.out.println(pessoas[i].getNome());
                    break;
                }
            }
        }
    }
}
