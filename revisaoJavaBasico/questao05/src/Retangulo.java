public class Retangulo {
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float area(){
        return largura * altura;
    }

    public float perimetro(){
        return 2*largura + 2 * altura;
    }

    public void imprimir(){
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro() + "\n\n");
    }



}
