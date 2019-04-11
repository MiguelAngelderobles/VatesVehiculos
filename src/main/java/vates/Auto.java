package vates;

public class Auto extends Vehiculo {
    public Auto(String marca,String modelo, int puertas, double precio) {
        super(marca,modelo,precio);
        this.puertas = puertas;
    }

    private int puertas;

    public int getPuertas() {
        return puertas;
    }
}
