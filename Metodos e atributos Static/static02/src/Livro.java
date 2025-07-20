import java.util.ArrayList;
import java.util.List;

public class Livro {

    private String isbn;
    private String titulo;
    private int quantidadeCapitulos;
    List<Capitulo> capitulos;

    public Livro(String isbn, String titulo, int quantidadeCapitulos) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.quantidadeCapitulos = 0;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
        quantidadeCapitulos++;
    }

    public void exibirRelatorio(){
        System.out.println("============= Dados do livro =============");
        System.out.println("Editora: " + Constantes.EDITORA);
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo:     " + titulo);
        System.out.println("Quantidade:     " + quantidadeCapitulos);
        System.out.println("Capitulos:    ");


        int totalDePaginas= 0;
        for (Capitulo capitulo : capitulos) {
            System.out.println("Capítulo       " + capitulo.getNumero() + "     " + capitulo.getTitulo() + "    - " + capitulo.getQuantidadedePaginas() + " páginas.");
            totalDePaginas += capitulo.getQuantidadedePaginas();
        }
        System.out.println("Quantidade de Paginas: " + totalDePaginas);


    }


}
