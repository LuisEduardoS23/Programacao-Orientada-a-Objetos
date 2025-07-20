public class TesteEmpregado {
    public static void main(String[] args) {
        EmpregadoComissionado empregado1 = new EmpregadoComissionado("Luis" , "07583378175", 4000, 0.25f);
        EmpregadoComissionadoComBase empregado2 = new EmpregadoComissionadoComBase("Maria", "12345678910", 4000, 0.25f, 2500);

        System.out.println("Empregado 1: " + empregado1.getNome() + "     Salario: " + empregado1.calcularSalario());
        System.out.println(("Empregado 2: " + empregado2.getNome() + "     Salario: " + empregado2.calcularSalario()));



    }
}
