public class Main {
    public static void main(String[] args) {
        Livro livroBom = new Livro("12121333545341162", "A hora da Estrela", 13);

        livroBom.adicionarCapitulo(new Capitulo("A culpa é minha", 10));
        livroBom.adicionarCapitulo(new Capitulo("Ela que se arranje", 10));
        livroBom.adicionarCapitulo(new Capitulo("O direito ao grito", 10));
        livroBom.adicionarCapitulo(new Capitulo("Quanto ao futuro", 10));
        livroBom.adicionarCapitulo(new Capitulo("Lamento de um blue", 10));
        livroBom.adicionarCapitulo(new Capitulo("Ela não sabe gritar", 10));
        livroBom.adicionarCapitulo(new Capitulo("Assovio ao vento escuro", 10));
        livroBom.adicionarCapitulo(new Capitulo("Eu não posso fazer nada", 10));
        livroBom.adicionarCapitulo(new Capitulo("Registro dos fatos antecedentes", 10));
        livroBom.adicionarCapitulo(new Capitulo("Hitória lacrimogênica de cordel", 10));
        livroBom.adicionarCapitulo(new Capitulo("Saída discreta pela porta dos fundos", 10));
        livroBom.adicionarCapitulo(new Capitulo("A hora da estrela", 10));

        livroBom.exibirRelatorio();
    }
}