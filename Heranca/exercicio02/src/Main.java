public class Main {
    public static void main(String[] arg) throws Exception {

        Administrador adm = new Administrador("Luis Eduardo", "luisesoares4@gmail.com", new String[]{"Cadastrar Usuarios", "Remover Usuarios", "Gerenciar Disciplinas"});
        adm.exibirPerfil();
        System.out.println();
        Aluno aluno = new Aluno("Maria Firmina", "mariafirminadosreis@gmail.com", "20242BCC.CAX0003", "Ciência da Computação");
        aluno.exibirPerfil();
        System.out.println();
        Professor professor = new Professor("Luiza Claudiane","luisaclasudiane@gmail.com",new String[]{"Banco de Dados", "Circuitos Digitais"} );
        professor.exibirPerfil();
        System.out.println();
    }
}