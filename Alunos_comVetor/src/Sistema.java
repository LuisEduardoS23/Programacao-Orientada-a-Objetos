import java.util.Scanner;


public class Sistema{
    private int MAX = 100;
    private Aluno alunos[];
    private int count;
    int option;

    public int menu(){
        String menu = "MENU\n"
            +"1 - Cadastrar aluno\n"
            +"2 - Exibir alunos\n"
            +"3 - Buscar aluno\n"
            +"0 - Sair\n"
            +"Digite uma opção:     \n";

            System.out.println(menu);
            Scanner sc = new Scanner(System.in);
            option = Integer.parseInt(sc.nextLine());
            return option;  

    }

    public void executar(){
        System.out.println("Sistema de cadastro de alunos");
        int option;
        Scanner sc = new Scanner(System.in);
        String nome;
        String matricula;
        float n1;
        float n2;
        alunos = new Aluno[MAX];
        count = 0;

        do { 
            option = menu();

            switch (option) {
                case 1:
                if (count < MAX){
                    System.err.println("Digite o nome do aluno: ");
                    nome = sc.nextLine();
                    
                    System.err.println("Digite a matrícula do aluno: ");
                    matricula = sc.nextLine();

                    System.out.println("Digite a N1 do aluno: ");
                    n1 = Float.parseFloat(sc.nextLine());


                    System.out.println("Digite a N2 do aluno: ");
                    n2 = Float.parseFloat(sc.nextLine());

                    alunos[count] = new Aluno(nome, matricula,  n1, n2);
                    count++;

                    System.out.println("Aluno cadastrado com sucesso!");

                } else{
                    System.out.println("Espaço insuficiente!");
                }  
                    break;

                case 2:
                    System.out.println("Alunos cadastrados:\n");

                    if(count == 0){
                        System.out.println("NENHUM ALUNO CADASTRADO...");
                    } else{
                    for(int i = 0; i < count; i++){

                        System.out.println("\nALUNO:  " + alunos[i].getNome() + " - " + alunos[i].getMatricula() + "\nNOTAS:    N1= " + alunos[i].getN1() + "  N2= " + alunos[i].getN2() + "    MEDIA= " + alunos[i].media());

                    }
                    }
                    break;

                case 3:
                    System.out.print("Digite a matrícula do Aluno que deseja buscar:  ");
                    String matriculaBusca = sc.nextLine();
                    boolean encontrado = false;
                    
                    for(int i = 0; i < count; i ++) {
                        if (alunos[i].getMatricula().equalsIgnoreCase(matriculaBusca)) {
                            System.out.println("\nALUNO:  " + alunos[i].getNome() + " - " + alunos[i].getMatricula() + "\nNOTAS:\n N1= " + alunos[i].getN1() + "  N2= " + alunos[i].getN2() + "    MEDIA= " + alunos[i].media());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\nNENHUM ALUNO COM ESTA MATRÍCULA FOI ENCONTRADO...");
                    }
                    break;

                    case 0:
                        System.out.println("\nSaindo...");
                        break;
                
            
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA\n");
                    break;
            }
            
        } while (option != 0);
    }




}


