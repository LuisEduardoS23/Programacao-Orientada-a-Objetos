class Professor  extends Usuario {
    protected String[] disciplinas;


    public Professor() {
        super();
        this.disciplinas = new String[0];
    }
    public Professor(String nome, String email, String[] disciplinas) {
        super(nome, email);
        this.disciplinas = disciplinas != null ? disciplinas : new String[0];
    }
    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas != null ? disciplinas : new String[0];
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.print("Disciplinas: ");
        if (disciplinas != null && disciplinas.length > 0) {
            for (String disciplina : disciplinas) {
                System.out.print(disciplina + " ");
            }
        } else {
            System.out.print("Nenhuma disciplina cadastrada.");
        }
        System.out.println();
    }

}