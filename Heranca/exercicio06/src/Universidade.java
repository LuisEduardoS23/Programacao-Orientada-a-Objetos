import java.util.ArrayList;

class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public Departamento buscarDepartamentoPorCodigo(int codigo) {
        for (Departamento d : departamentos) {
            if (d.getCodigo() == codigo) {
                return d;
            }
        }
        return null;
    }

    public ArrayList<Departamento> buscarDepartamentoPorNome(String nome) {
        ArrayList<Departamento> resultado = new ArrayList<>();
        for (Departamento d : departamentos) {
            if (d.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public ArrayList<Funcionario> buscarFuncionarioPorNome(String nome) {
        ArrayList<Funcionario> resultado = new ArrayList<>();
        for (Departamento d : departamentos) {
            resultado.addAll(d.buscarPorNome(nome));
        }
        return resultado;
    }

    public ArrayList<Departamento> listarDepartamentosComFaixaSalarial(double minimo, double maximo) {
        ArrayList<Departamento> resultado = new ArrayList<>();
        for (Departamento d : departamentos) {
            if (!d.filtrarPorFaixaSalarial(minimo, maximo).isEmpty()) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public ArrayList<Funcionario> listarFuncionariosComFaixaSalarial(double minimo, double maximo) {
        ArrayList<Funcionario> resultado = new ArrayList<>();
        for (Departamento d : departamentos) {
            resultado.addAll(d.filtrarPorFaixaSalarial(minimo, maximo));
        }
        return resultado;
    }

    public ArrayList<Departamento> listarDepartamentosComGastoEntre(double minimo, double maximo) {
        ArrayList<Departamento> resultado = new ArrayList<>();
        for (Departamento d : departamentos) {
            double gasto = d.calcularGastoTotal();
            if (gasto >= minimo && gasto <= maximo) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public ArrayList<Funcionario> listarTodosFuncionarios() {
        ArrayList<Funcionario> todos = new ArrayList<>();
        for (Departamento d : departamentos) {
            todos.addAll(d.getFuncionarios());
        }
        return todos;
    }

    public ArrayList<Departamento> listarTodosDepartamentos() {
        return new ArrayList<>(departamentos);
    }

    public ArrayList<FuncionarioDocente> listarTodosDocentes() {
        ArrayList<FuncionarioDocente> docentes = new ArrayList<>();
        for (Departamento d : departamentos) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f instanceof FuncionarioDocente) {
                    docentes.add((FuncionarioDocente) f);
                }
            }
        }
        return docentes;
    }

    public ArrayList<FuncionarioTecnico> listarTodosTecnicos() {
        ArrayList<FuncionarioTecnico> tecnicos = new ArrayList<>();
        for (Departamento d : departamentos) {
            for (Funcionario f : d.getFuncionarios()) {
                if (f instanceof FuncionarioTecnico) {
                    tecnicos.add((FuncionarioTecnico) f);
                }
            }
        }
        return tecnicos;
    }
}
