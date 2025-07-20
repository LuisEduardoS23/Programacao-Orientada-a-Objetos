public class Api extends Usuario implements Autenticavel{
    private Usuario usuario;

    public Api(String nome, String email) {
        super(nome, email);
    }

    @Override
    public boolean autenticar(){
        System.out.println("Olá "+ getNome() + ", Token de segurança recebido, acesso por API liberado!\n");
        return true;
    }
}
