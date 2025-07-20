class Aplicativo extends Usuario implements Autenticavel{
    private Usuario usuario;

    public Aplicativo(String nome, String email) {
        super(nome, email);
    }


    @Override
    public boolean autenticar() {
        System.out.println("Olá "+ getNome() + ", Biometria reconhecida, acesso por app liberado!\n");
        return true;
    }

}
