public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora(){
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }


    public double somar(){
        return num1 + num2;
    }

    public double subtrair(){
        return num1 - num2;
    }

    public double multiplicar(){
        return num1 * num2;
    }

    public double dividir(){
        return num1 / num2;
    }

    public double potenciar(){
        double resultado = num1;
        for (int i = 0; i < num2-1 ; i++){
            resultado *= num1;
        }
        return resultado;
    }







}
