public class Data {

    private int dia;
    private int mes;
    private int ano;


    public Data(){
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }


    public void displayData(){
        String diaString = String.valueOf(dia);
        String mesString = String.valueOf(mes);
        if(dia < 10){
            diaString = "0" + diaString;
        }
        if(mes<10){
            mesString = "0" + mesString;
        }

        System.out.println(diaString +"/" + mesString + "/" + ano);
    }

}
