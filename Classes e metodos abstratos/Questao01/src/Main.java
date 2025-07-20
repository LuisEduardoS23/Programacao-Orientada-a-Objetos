public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("Luis", 10);

        Pessoa lara = new Pessoa("Lara Luiza", 5);
        lara.adicionarContato(new Email("laraluiza@gmail.com"));
        lara.adicionarContato(new Telefone("9999-9999"));

        Pessoa joao = new Pessoa("João", 5);
        joao.adicionarContato(new Telefone("12345-6789"));

        agenda.addPessoa(lara);
        agenda.addPessoa(joao);

        agenda.exibirTodasPessoas();

        System.out.println("\nContatos de Lara:");
        agenda.exibirContatosPessoa("Lara Luiza");

        System.out.println("\nPessoas com email:");
        agenda.exibirPessoasComEmail();

        System.out.println("\nBuscar por telefone '12345-6789':");
        agenda.recuperarPessoaPorTelefone("12345-6789");

        System.out.println("\nBuscar por email 'laraluiza@gmail.com':");
        agenda.recuperarPessoaPorEmail("laraluiza@gmail.com");
    }
}
