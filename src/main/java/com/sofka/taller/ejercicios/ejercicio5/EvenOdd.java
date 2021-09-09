package com.sofka.taller.ejercicios.ejercicio5;

public class EvenOdd {

    public String generateNumberPair(){

        StringBuilder numberOdd = new StringBuilder();

        int i=0;
        while(i<=100){
            if(i%2==0){
                numberOdd.append(i).append(" ");
            }
            i++;
        }

        return numberOdd.toString();
    }

    public String generateNumberOdd(){
        int i=0;
        StringBuilder numberEven = new StringBuilder();
        while (i<=100){
            if(i%2!=0){
                numberEven.append(i).append(" ");
            }
            i++;
        }

        return  numberEven.toString();
    }

}
