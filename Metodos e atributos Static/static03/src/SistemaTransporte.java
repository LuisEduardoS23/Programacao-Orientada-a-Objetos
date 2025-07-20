public class SistemaTransporte {
    public static void main(String[] args) {

        Passagem[] passagens = new Passagem[4];

        passagens[0] = new PassagemEstudante("Luis Eduardo", 4);
        passagens[1] = new Passagem("João", 4);
        passagens[2] = new PassagemEstudante("Maria", 4);
        passagens[3] = new Passagem("Zezinho", 4);


        for (Passagem p : passagens) {
            System.out.println(p.toString());
        }

    }
}