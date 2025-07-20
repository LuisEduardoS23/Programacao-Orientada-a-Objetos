public class Main {
    public static void main(String[] args) {

        Autenticavel[] usuarios = new Autenticavel[3];

        usuarios[0] = new Aplicativo("Luis Eduardo", "luisesoares4@gmail.com");
        usuarios[1] = new Site("Joãozinho", "joaozinhomatadordeporco@gmail.com");
        usuarios[2] = new Api("Claudiane", "claudianeluiza@gmail.com");

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].autenticar());
        }



    }
}