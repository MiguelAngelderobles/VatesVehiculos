package vates;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){

        Auto peugeot=new Auto("Peugeot","206",4,200000.00);/*reodenar*/
        Auto peugeot1=new Auto("Peugeot","208",5,250000.00);
        Moto honda=new Moto("Honda","Titan",125,60000.00);
        Moto yamaha=new Moto("Yamaha","YBR",160,80500.50);


        List<Vehiculo> vehiculos=new ArrayList<>();

        vehiculos.add(peugeot);
        vehiculos.add(peugeot1);
        vehiculos.add(honda);
        vehiculos.add(yamaha);

        Vehiculo maximo = vehiculos.stream().max((v1,v2) -> v1.getPrecio().compareTo(v2.getPrecio())).get();
        Vehiculo minimo = vehiculos.stream().min((v1,v2) -> v1.getPrecio().compareTo(v2.getPrecio())).get();

        Vehiculo conY = vehiculos.stream().filter(vehiculo -> vehiculo.getModelo().contains("Y")).findFirst().get();

        System.out.println("Vehiculo con precio maximo: "+maximo);
        System.out.println("");
        System.out.println("");
        System.out.println("Vehiculo con precio minimo: "+minimo);
        System.out.println("");
        System.out.println("");
        System.out.println("Vehiculo con modelo letra Y: "+conY);
        System.out.println("");
        System.out.println("");

        System.out.println("Ordenado por precio mayor a menor: ");
        System.out.println("");

        vehiculos.stream().sorted().forEach(System.out::println);




        /*char conseguirletraodigito=object.getMetodo.charAt(4)<-5ta posicion;
        *public boolean equals(Object o){
        * if(this==o)return true;
        * if(o==null o getClass()!= o.getObjectClass() ) return false;
        * Figura figura=(Figura)o;
        * return Objects.equals(getColor(),figura.getColor()) and Object.equals(area(),figura.area();)}
        *
        * public int hashCOde(){
        * return Objects.hash(getColor(),area())
        *
        * System.out.println(persona1)(sout);
        *
        * ;}
        * */
    }
}
