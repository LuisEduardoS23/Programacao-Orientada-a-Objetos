public class Capitulo {

    private static int numerodeCapitulos = 0;
    private int numero;
    private String titulo;
    private int quantidadedePaginas;

    public Capitulo(String titulo, int quantidadedePaginas) {
        numerodeCapitulos++;
        this.numero = numerodeCapitulos;
        this.titulo = titulo;
        this.quantidadedePaginas = quantidadedePaginas;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadedePaginas() {
        return quantidadedePaginas;
    }




}
