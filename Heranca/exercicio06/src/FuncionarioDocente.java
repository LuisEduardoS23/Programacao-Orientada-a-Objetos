class FuncionarioDocente extends Funcionario {
    private String titulacao;

    public FuncionarioDocente(int codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.titulacao = titulacao;
    }

    @Override
    public String getTipo() {
        return "Docente - " + titulacao;
    }
}