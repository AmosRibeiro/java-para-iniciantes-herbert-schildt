package capitulo07.extendvehicle;

public class Truck extends VehicleExt{
    private int cargocap; // Capacidade de carga em litros.

    Truck(int p, int f, int m, int c){
        super(p, f, m);

        cargocap = c;
    }

    int getCargo(){
        return cargocap;
    }
    void putCargo(int c){
        cargocap = c;
    }
}
