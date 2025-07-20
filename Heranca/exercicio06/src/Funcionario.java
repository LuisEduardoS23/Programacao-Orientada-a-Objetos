abstract class Funcionario {
    private int codigo;
    private String nome;
    private double salario;

    public Funcionario(int codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getSalario() { return salario; }

    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("Código: %d | Nome: %s | Salário: R$%.2f | Tipo: %s",
                codigo, nome, salario, getTipo());
    }
}
