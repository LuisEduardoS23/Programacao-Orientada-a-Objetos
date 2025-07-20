import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Universidade universidade = new Universidade("Universidade Federal");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1: cadastrarDepartamento(); break;
                case 2: cadastrarFuncionarioTecnico(); break;
                case 3: cadastrarFuncionarioDocente(); break;
                case 4: buscarDepartamentoPorNome(); break;
                case 5: buscarFuncionarioPorNome(); break;
                case 6: listarDepartamentosComFaixaSalarial(); break;
                case 7: listarFuncionariosComFaixaSalarial(); break;
                case 8: listarDepartamentosComGastoEntre(); break;
                case 9: listarTodosFuncionarios(); break;
                case 10: listarTodosDepartamentos(); break;
                case 11: listarDepartamentosEFuncionarios(); break;
                case 12: listarTodosDocentes(); break;
                case 13: listarTodosTecnicos(); break;
                case 0: System.out.println("Saindo do sistema..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU DE OPÇÕES ===");
        System.out.println("1 – Cadastrar Departamento");
        System.out.println("2 – Cadastrar Funcionário Técnico");
        System.out.println("3 – Cadastrar Funcionário Docente");
        System.out.println("4 – Buscar Departamento por Nome");
        System.out.println("5 – Buscar Funcionário por Nome");
        System.out.println("6 – Listar Departamentos com Funcionários com Faixa Salarial Específica");
        System.out.println("7 – Listar Funcionários com Faixa Salarial Específica");
        System.out.println("8 – Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica");
        System.out.println("9 – Listar todos Funcionários da Universidade");
        System.out.println("10 – Listar todos Departamentos da Universidade");
        System.out.println("11 – Listar todos Departamentos da Universidade e seus Respectivos Funcionários");
        System.out.println("12 – Listar todos Funcionários Docente");
        System.out.println("13 – Listar todos Funcionários Técnico");
        System.out.println("0 – Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarDepartamento() {
        System.out.println("\n--- Cadastrar Departamento ---");
        System.out.print("Código do departamento: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do departamento: ");
        String nome = scanner.nextLine();

        Departamento novo = new Departamento(codigo, nome);
        universidade.adicionarDepartamento(novo);
        System.out.println("Departamento cadastrado com sucesso!");
    }

    private static void cadastrarFuncionarioTecnico() {
        System.out.println("\n--- Cadastrar Funcionário Técnico ---");
        System.out.print("Código do funcionário: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nível: ");
        String nivel = scanner.nextLine();

        System.out.print("Código do departamento: ");
        int codDepto = scanner.nextInt();
        scanner.nextLine();

        Departamento depto = universidade.buscarDepartamentoPorCodigo(codDepto);
        if (depto != null) {
            FuncionarioTecnico tecnico = new FuncionarioTecnico(codigo, nome, salario, nivel);
            depto.adicionarFuncionario(tecnico);
            System.out.println("Funcionário técnico cadastrado com sucesso!");
        } else {
            System.out.println("Departamento não encontrado!");
        }
    }

    private static void cadastrarFuncionarioDocente() {
        System.out.println("\n--- Cadastrar Funcionário Docente ---");
        System.out.print("Código do funcionário: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Titulação: ");
        String titulacao = scanner.nextLine();

        System.out.print("Código do departamento: ");
        int codDepto = scanner.nextInt();
        scanner.nextLine();

        Departamento depto = universidade.buscarDepartamentoPorCodigo(codDepto);
        if (depto != null) {
            FuncionarioDocente docente = new FuncionarioDocente(codigo, nome, salario, titulacao);
            depto.adicionarFuncionario(docente);
            System.out.println("Funcionário docente cadastrado com sucesso!");
        } else {
            System.out.println("Departamento não encontrado!");
        }
    }

    private static void buscarDepartamentoPorNome() {
        System.out.println("\n--- Buscar Departamento por Nome ---");
        System.out.print("Digite parte do nome: ");
        String nome = scanner.nextLine();

        ArrayList<Departamento> encontrados = universidade.buscarDepartamentoPorNome(nome);
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum departamento encontrado!");
        } else {
            System.out.println("Departamentos encontrados:");
            for (Departamento d : encontrados) {
                System.out.println(d);
            }
        }
    }

    private static void buscarFuncionarioPorNome() {
        System.out.println("\n--- Buscar Funcionário por Nome ---");
        System.out.print("Digite parte do nome: ");
        String nome = scanner.nextLine();

        ArrayList<Funcionario> encontrados = universidade.buscarFuncionarioPorNome(nome);
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum funcionário encontrado!");
        } else {
            System.out.println("Funcionários encontrados:");
            for (Funcionario f : encontrados) {
                System.out.println(f);
            }
        }
    }

    private static void listarDepartamentosComFaixaSalarial() {
        System.out.println("\n--- Departamentos com Faixa Salarial ---");
        System.out.print("Salário mínimo: ");
        double minimo = scanner.nextDouble();
        System.out.print("Salário máximo: ");
        double maximo = scanner.nextDouble();
        scanner.nextLine();

        ArrayList<Departamento> deptos = universidade.listarDepartamentosComFaixaSalarial(minimo, maximo);
        if (deptos.isEmpty()) {
            System.out.println("Nenhum departamento encontrado com funcionários nessa faixa salarial!");
        } else {
            System.out.println("Departamentos com funcionários entre R$" + minimo + " e R$" + maximo + ":");
            for (Departamento d : deptos) {
                System.out.println(d);
            }
        }
    }

    private static void listarFuncionariosComFaixaSalarial() {
        System.out.println("\n--- Funcionários com Faixa Salarial ---");
        System.out.print("Salário mínimo: ");
        double minimo = scanner.nextDouble();
        System.out.print("Salário máximo: ");
        double maximo = scanner.nextDouble();
        scanner.nextLine();

        ArrayList<Funcionario> funcionarios = universidade.listarFuncionariosComFaixaSalarial(minimo, maximo);
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário encontrado nessa faixa salarial!");
        } else {
            System.out.println("Funcionários entre R$" + minimo + " e R$" + maximo + ":");
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    private static void listarDepartamentosComGastoEntre() {
        System.out.println("\n--- Departamentos com Gasto Total ---");
        System.out.print("Valor mínimo: ");
        double minimo = scanner.nextDouble();
        System.out.print("Valor máximo: ");
        double maximo = scanner.nextDouble();
        scanner.nextLine();

        ArrayList<Departamento> deptos = universidade.listarDepartamentosComGastoEntre(minimo, maximo);
        if (deptos.isEmpty()) {
            System.out.println("Nenhum departamento encontrado com gasto total nessa faixa!");
        } else {
            System.out.println("Departamentos com gasto total entre R$" + minimo + " e R$" + maximo + ":");
            for (Departamento d : deptos) {
                System.out.printf("%s | Gasto total: R$%.2f\n", d, d.calcularGastoTotal());
            }
        }
    }

    private static void listarTodosFuncionarios() {
        System.out.println("\n--- Todos os Funcionários ---");
        ArrayList<Funcionario> funcionarios = universidade.listarTodosFuncionarios();
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado!");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }

    private static void listarTodosDepartamentos() {
        System.out.println("\n--- Todos os Departamentos ---");
        ArrayList<Departamento> departamentos = universidade.listarTodosDepartamentos();
        if (departamentos.isEmpty()) {
            System.out.println("Nenhum departamento cadastrado!");
        } else {
            for (Departamento d : departamentos) {
                System.out.println(d);
            }
        }
    }

    private static void listarDepartamentosEFuncionarios() {
        System.out.println("\n--- Departamentos e Funcionários ---");
        ArrayList<Departamento> departamentos = universidade.listarTodosDepartamentos();
        if (departamentos.isEmpty()) {
            System.out.println("Nenhum departamento cadastrado!");
        } else {
            for (Departamento d : departamentos) {
                System.out.println("\n" + d.getNome() + ":");
                ArrayList<Funcionario> funcionarios = d.getFuncionarios();
                if (funcionarios.isEmpty()) {
                    System.out.println("  Nenhum funcionário cadastrado");
                } else {
                    for (Funcionario f : funcionarios) {
                        System.out.println("  - " + f);
                    }
                }
            }
        }
    }

    private static void listarTodosDocentes() {
        System.out.println("\n--- Todos os Docentes ---");
        ArrayList<FuncionarioDocente> docentes = universidade.listarTodosDocentes();
        if (docentes.isEmpty()) {
            System.out.println("Nenhum docente cadastrado!");
        } else {
            for (FuncionarioDocente d : docentes) {
                System.out.println(d);
            }
        }
    }

    private static void listarTodosTecnicos() {
        System.out.println("\n--- Todos os Técnicos ---");
        ArrayList<FuncionarioTecnico> tecnicos = universidade.listarTodosTecnicos();
        if (tecnicos.isEmpty()) {
            System.out.println("Nenhum técnico cadastrado!");
        } else {
            for (FuncionarioTecnico t : tecnicos) {
                System.out.println(t);
            }
        }
    }
}