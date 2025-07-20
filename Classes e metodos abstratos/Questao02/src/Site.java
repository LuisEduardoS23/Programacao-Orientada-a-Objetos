import java.util.Scanner;

class Site extends Usuario implements Autenticavel{
    Scanner input = new Scanner(System.in);
    private Usuario usuario;

    public Site(String nome, String email){
        super(nome, email);
    }


    @Override
    public boolean autenticar(){
        System.out.println("Olá "+ getNome() + ", Seu email e senha foram confirmados, acesso por Site liberado!\n");
        return true;
    }

}
