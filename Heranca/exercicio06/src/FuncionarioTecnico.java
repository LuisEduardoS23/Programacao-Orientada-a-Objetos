class FuncionarioTecnico extends Funcionario {
    private String nivel;

    public FuncionarioTecnico(int codigo, String nome, double salario, String nivel) {
        super(codigo, nome, salario);
        this.nivel = nivel;
    }

    @Override
    public String getTipo() {
        return "Técnico - Nível " + nivel;
    }
}
