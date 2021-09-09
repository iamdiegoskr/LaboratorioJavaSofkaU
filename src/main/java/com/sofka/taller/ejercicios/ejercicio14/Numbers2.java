package com.sofka.taller.ejercicios.ejercicio14;

public class Numbers2 {

    public String printNumbers(int startNumber){

        StringBuilder sequence = new StringBuilder();

        for (int i = startNumber; i <= 1000; i+=2) {

            sequence.append(i).append("\n");

        }
        return sequence.toString();
    }

}
