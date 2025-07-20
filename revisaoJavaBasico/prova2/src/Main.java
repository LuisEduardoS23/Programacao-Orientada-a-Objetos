public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Luis Eduardo", 4000);
        FuncionarioComissionado funcionario2 = new FuncionarioComissionado("Maria Jose", 2500, 1500);

        System.out.println("Funcionario1: " + funcionario1.getNome());
        System.out.println("Salario do Funcionario1 :" + funcionario1.getSalarioBase());
        System.out.println("\n\nFuncionario2: " + funcionario2.getNome());
        System.out.println("Salario do Funcionario2 :" + funcionario2.calcularSalarioTotal());

    }
}