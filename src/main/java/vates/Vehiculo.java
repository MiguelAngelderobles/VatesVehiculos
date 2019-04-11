package vates;

import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String modelo;
    private Double precio;
    private  String marca;

    public Vehiculo( String modelo,String marca, double precio) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(String marca){
        return marca;
    }


    public Double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return -1* this.getPrecio().compareTo(o.getPrecio());
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(modelo, vehiculo.modelo) &&
                Objects.equals(precio, vehiculo.precio) &&
                Objects.equals(marca, vehiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, precio, marca);
    }

}
