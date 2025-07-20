import java.util.ArrayList;
import java.util.Scanner;

public class Instituto {
    private String nomeInstituto;
    private ArrayList<Departamento> departamentosInstituto;

    public Instituto(String nome) {
        this.nomeInstituto = nome;
        this.departamentosInstituto = new ArrayList<Departamento>();
    }

    public String getNomeInstituto() {
        return nomeInstituto;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentosInstituto;
    }

    public void assDepto(Departamento departamento) {
        departamentosInstituto.add(departamento);
    }

    public Departamento criarDepartamento(Scanner input) {
        System.out.print("Insira o código do departamento: ");
        String codigo = input.nextLine();

        System.out.print("Insira o nome do departamento: ");
        String nome = input.nextLine();

        System.out.print("Insira o telefone do departamento: ");
        String telefone = input.nextLine();

        Departamento departamento = new Departamento(codigo, nome, telefone);

        return departamento;
    }
}

