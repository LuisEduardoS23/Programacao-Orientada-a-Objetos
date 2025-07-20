
public class App {
    public static void main(String[] args) throws Exception {
       
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Luis Eduardo");
        aluno1.setRa("20242BCC.CAX0003");
        aluno1.setT1(10);
        aluno1.setT2(8);
        aluno1.setP1(8.5f);
        aluno1.setP2(7.2f);

        System.out.println("============================== INICIO ==============================");

        System.out.println("Nome : " + aluno1.getNome() + "sua média é: " + aluno1.calculaMedia());

        


    }
}
