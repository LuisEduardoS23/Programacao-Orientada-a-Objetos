class Aluno extends Usuario {
    protected String matricula;
    protected  String curso;

    public Aluno(){
        super();
        this.matricula = "";
        this.curso = "";
    }
    public Aluno(String nomeAluno, String emailAluno, String materia, String curso){
        super(nomeAluno, emailAluno);
        this.matricula = materia;
        this.curso = curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }
}