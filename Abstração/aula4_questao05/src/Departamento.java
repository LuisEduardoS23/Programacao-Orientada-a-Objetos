import java.util.ArrayList;
import java.util.Scanner;

public class Departamento {

    private String codigoDepartamento;
    private String nomeDepartamento;
    private String telefoneDepartamento;
    private ArrayList<Funcionario> funcionariosDepartamento;

    public Departamento(String codigo, String nome, String telefone) {
        this.codigoDepartamento = codigo;
        this.nomeDepartamento = nome;
        this.telefoneDepartamento = telefone;
        this.funcionariosDepartamento = new ArrayList<Funcionario>();
    }

    public void addFuncionarioDepartamento(Funcionario funcionario) {
        funcionariosDepartamento.add(funcionario);
    }

    public String getCodigo() {
        return codigoDepartamento;
    }

    public String getNome() {
        return nomeDepartamento;
    }

    public String getTelefone() {
        return telefoneDepartamento;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionariosDepartamento;
    }

    public static Funcionario criarFuncionario(Scanner input) {
        System.out.print("Insira o código do funcionário: ");
        String codigo = input.nextLine();

        System.out.print("Insira o nome do funcionário: ");
        String nome = input.nextLine();

        System.out.print("Insira a função do funcionário: ");
        String funcao = input.nextLine();

        System.out.print("Insira o salário do funcionário: ");
        double salario = input.nextDouble();
        input.nextLine();

        return new Funcionario(codigo, nome, funcao, salario);
    }
}

