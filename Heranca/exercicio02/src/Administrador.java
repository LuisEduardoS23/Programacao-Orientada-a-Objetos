class Administrador extends Usuario {
    protected String[] permissoes;

    public Administrador() {
        super();
        this.permissoes = new String[0];
    }

    public Administrador(String nomeUsuario, String emailUsuario, String[] permissoes) {
        super(nomeUsuario, emailUsuario);
        this.permissoes = permissoes != null ? permissoes : new String[0];
    }

    public String[] getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(String[] permissoes) {
        this.permissoes = permissoes != null ? permissoes : new String[0];
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.print("Permissões: ");
        if (permissoes != null && permissoes.length > 0) {
            for (String permissao : permissoes) {
                System.out.print(permissao + " ");
            }
        } else {
            System.out.print("Nenhuma permissão cadastrada.");
        }
        System.out.println();
    }
}