public class EmpregadoTeste {
    public static void main(String[] args) throws Exception {
        
        Empregado empregado1 = new Empregado("Luis Eduardo", "Silva Soares", 5000.00);
        Empregado empregado2 = new Empregado("Jair Messias", "Inacio Lula", 250.00);

        System.out.println("Empregados: ");
        System.out.println("Nome: " + empregado1.getNome() + "      Sobrenome: " + empregado1.getSobrenome() + "        Salario Mensal: R$ " + empregado1.getSalario() + "      Salario Anual: R$ " + empregado1.salarioAnual());

        System.out.println("Nome: " + empregado2.getNome() + "      Sobrenome: " + empregado2.getSobrenome() + "        Salario Mensal: R$ " + empregado2.getSalario() + "      Salario Anual: R$ " + empregado2.salarioAnual());

        empregado1.aumentoSalarial();
        empregado2.aumentoSalarial();

        System.out.println("\n\nEmpregados apos aumento salarial:");
        
        System.out.println("Nome: " + empregado1.getNome() + "      Sobrenome: " + empregado1.getSobrenome() + "        Salario Mensal: R$ " + empregado1.getSalario() + "      Salario Anual: R$ " + empregado1.salarioAnual());

        System.out.println("Nome: " + empregado2.getNome() + "      Sobrenome: " + empregado2.getSobrenome() + "        Salario Mensal: R$ " + empregado2.getSalario() + "      Salario Anual: R$ " + empregado2.salarioAnual());


    }
}
