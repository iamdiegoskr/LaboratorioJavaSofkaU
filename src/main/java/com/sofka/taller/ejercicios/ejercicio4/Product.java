package com.sofka.taller.ejercicios.ejercicio4;

public class Product {

    static final double IVA = 0.21;

    public String responsePriceIvA(String name, double price){

        return "El producto " + name + " tiene un precio final con iva de = " + calculateIVA(price);

    }

    public double calculateIVA(double price){
        return price + (price*IVA);
    }

}
