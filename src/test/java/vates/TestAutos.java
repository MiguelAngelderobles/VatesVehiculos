package vates;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestAutos {

    private ArrayList<Vehiculo> vehiculos;

    @BeforeTest
    public void setUp(){




    }

    @Test
    public void test(){

        Auto peugeot=new Auto("Peugeot","307",4,250000.00);
        Auto peugeot1=new Auto("Peugeot","407",4,350000.00);
        Auto peugeot2=new Auto("Peugeot","107",4,50000.00);
        Auto peugeot3=new Auto("Peugeot","207",4,150000.00);

        vehiculos=new ArrayList<>();
        vehiculos.add(peugeot);
        vehiculos.add(peugeot1);
        vehiculos.add(peugeot2);
        vehiculos.add(peugeot3);

        Vehiculo maximo = vehiculos.stream().max((v1,v2) -> v1.getPrecio().compareTo(v2.getPrecio())).get();

        Assert.assertEquals(maximo,peugeot1);
    }
    @Test
    public void test2(){

        Moto honda=new Moto("Honda","Cbx550",340,56000.00);
        Moto honda2=new Moto("Honda","Cbx550",340,256000.00);
        Moto honda3=new Moto("Honda","Cbx550",340,156000.00);

        vehiculos=new ArrayList<>();
        vehiculos.add(honda);
        vehiculos.add(honda2);
        vehiculos.add(honda3);
        Vehiculo minimo = vehiculos.stream().min((v1,v2) -> v1.getPrecio().compareTo(v2.getPrecio())).get();


        Assert.assertEquals(minimo,honda);


    }
    @Test
    public void test3(){

        Moto honda=new Moto("Honda","Cbx550",340,56000.00);
        Moto honda2=new Moto("Honda","cf50",340,256000.00);
        Moto yamaha=new Moto("Yamaha","Y25",340,156000.00);

        vehiculos=new ArrayList<>();
        vehiculos.add(honda);
        vehiculos.add(honda2);
        vehiculos.add(yamaha);
        Vehiculo conY = vehiculos.stream().filter(vehiculo -> vehiculo.getModelo().contains("Y")).findFirst().get();
        Assert.assertEquals(conY,yamaha);
    }
}
