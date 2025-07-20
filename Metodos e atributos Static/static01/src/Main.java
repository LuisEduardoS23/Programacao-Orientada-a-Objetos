public class Main {
    public static void main(String[] args) {

        float[] vetor = {2.5f, 3.87f, 99.9f, 2, 5.75f, 23.23f, 66.6f};

        System.out.println("Media do vetor:     " + Utilidade.media(vetor));
        System.out.println("Somatório do vetor:     " + Utilidade.soma(vetor));
        System.out.println("Maior número do vetor:     " + Utilidade.maior(vetor));
        System.out.println("Media do vetor:     " + Utilidade.menor(vetor));
        System.out.println("Maior entre -4 e -7:    " + Utilidade.max(-4, -7));
        System.out.println("Maior entre 1 e 1:    " + Utilidade.max(1, 1));
        System.out.println("Desvio padrão do vetor:    " + Utilidade.desvioPadrao(vetor));



    }
}