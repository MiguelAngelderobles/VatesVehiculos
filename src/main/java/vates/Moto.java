package vates;

public class Moto extends Vehiculo{
    public Moto( String marca,String modelo, int cilindrada, double precio) {
        super(marca,modelo, precio);
        this.cilindrada = cilindrada;
    }

    private int cilindrada;

    public int getCilindrada(){
        return cilindrada;
    }

}
