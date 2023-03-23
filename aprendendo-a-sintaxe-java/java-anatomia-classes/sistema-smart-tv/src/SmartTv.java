public class SmartTv {
    private boolean ligada = false;
    private int canal = 1, volume = 25;

    public void botaoOnOff() {
        ligada = (ligada ?  false :  true);
    }

    public String estadoTv() {
        return ligada ? "Ligada" : "Desligada";
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void aumentarCanal() {
        this.canal++;
    }
    
    public void diminuirCanal() {
        this.canal--;
    }

    public void aumentarVolume() {
        this.volume++;
    }
    
    public void diminuirVolume() {
        this.volume--;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

}
