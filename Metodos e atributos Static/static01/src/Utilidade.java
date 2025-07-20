public class Utilidade {

    public static float media(float[] vetor){
        float somatorio = 0;
        for (int i = 0; i < vetor.length; i++){
            somatorio += vetor[i];
        }
        float media = somatorio / vetor.length;
        return media;
    }

    public static float soma(float[] vetor){
        float soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }

    public static float maior(float[] vetor){
        float maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static float menor(float[] vetor){
        float menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static int max(int A, int B) {
        if (A > B) {
            return A;
        }
        else if (B > A) {
            return B;
        }
        else {
            System.out.println("Números iguais!!!");
            return -1;
        }
    }

    public static  float desvioPadrao(float[] vetor){
        float media = media(vetor);
        float somatorioDoQuadradodaDiferenca = 0;
        for (int i = 0; i < vetor.length; i++) {
            float diferenca = vetor[i] - media;
            somatorioDoQuadradodaDiferenca += diferenca * diferenca;
        }

        float num1 = somatorioDoQuadradodaDiferenca / ((vetor.length) - 1);
        float desvioPadrao = (float) Math.sqrt(num1);

        return desvioPadrao;
    }







}
