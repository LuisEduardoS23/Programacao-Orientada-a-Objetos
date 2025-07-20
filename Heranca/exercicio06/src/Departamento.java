import java.util.ArrayList;

class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public ArrayList<Funcionario> getFuncionarios() { return new ArrayList<>(funcionarios); }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularGastoTotal() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.getSalario();
        }
        return total;
    }

    public ArrayList<Funcionario> buscarPorNome(String nome) {
        ArrayList<Funcionario> resultado = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(f);
            }
        }
        return resultado;
    }

    public ArrayList<Funcionario> filtrarPorFaixaSalarial(double minimo, double maximo) {
        ArrayList<Funcionario> resultado = new ArrayList<>();
        for (Funcionario f : funcionarios) {
            if (f.getSalario() >= minimo && f.getSalario() <= maximo) {
                resultado.add(f);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%d funcionários)", codigo, nome, funcionarios.size());
    }
}
