public class Funcionario {
    private String codigoFuncionario;
    private String nomeFuncionario;
    private String funcaoFuncionario;
    private double salarioFuncionario;

    public Funcionario(String codigo, String nome, String funcao, double salario) {
        this.codigoFuncionario = codigo;
        this.nomeFuncionario = nome;
        this.funcaoFuncionario = funcao;
        this.salarioFuncionario = salario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
}

