public class Lamp {
    private String model;
    private String tensao;
    private String color;
    private String tipoLuz;
    private String[] tipos;
    private int potencia;
    private int garantiaMeses;
    private boolean tipoAbajur;
    private boolean ligado;

    public Lamp() {

    }

    public Lamp(String model, String tensao, String color, String tipoLuz, String[] tipos, int potencia, int garantiaMeses, boolean tipoAbajur, boolean ligado) {
        this.model = model;
        this.tensao = tensao;
        this.color = color;
        this.tipoLuz = tipoLuz;
        this.tipos = tipos;
        this.potencia = potencia;
        this.garantiaMeses = garantiaMeses;
        this.tipoAbajur = tipoAbajur;
        this.ligado = ligado;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        setLigado(true);
    }

    public void desligar(){
        setLigado(false);
    }

    public void mostrarEstado(){
        if (isLigado()) {
            System.out.println("Ligado");
        } else {
            System.out.println("Desligado");
        }
    }

    public void mudarEstado() {
        if (isLigado()) {
            setLigado(false);
        } else {
            setLigado(true);
        }
    }
}
