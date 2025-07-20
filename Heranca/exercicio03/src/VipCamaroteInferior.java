class VipCamaroteInferior extends IngressoVip{
    private String localizacao;

    public VipCamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao(){
        System.out.println("Localização: " + getLocalizacao());
    }


}
