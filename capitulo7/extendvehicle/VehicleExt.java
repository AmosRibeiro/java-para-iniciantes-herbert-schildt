package capitulo7.extendvehicle;

public class VehicleExt {
    private int passagers;
    private int fuelcap;
    private int mpg;

    //Construtor para veiculo.
    VehicleExt(int p, int f, int m){
        passagers = p;
        fuelcap = f;
        mpg = m;
    }
    //Retorna autonomia do veiculo.
    int range(){
        return mpg * fuelcap;
    }
    //Calcula o combustivel necessaria para cobrir determinada distância.
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }

    // Getters and setters
    public int getPassagers() {
        return passagers;
    }
    public void setPassagers(int p) {
        this.passagers = p;
    }
    public int getFuelcap() {
        return fuelcap;
    }
    public void setFuelcap(int f) {
        this.fuelcap = f;
    }
    public int getMpg() {
        return mpg;
    }
    public void setMpg(int m) {
        this.mpg = m;
    }
    
}
