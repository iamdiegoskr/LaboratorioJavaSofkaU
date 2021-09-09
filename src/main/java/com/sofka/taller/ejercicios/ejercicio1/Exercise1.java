package com.sofka.taller.ejercicios.ejercicio1;

public class Exercise1 {

    public String biggerNumber(int num1, int num2){

        if(num1>num2){
            return "El numero mayor es " + num1;
        }else if(num1<num2){
            return "El numero mayor es " + num2;
        }else{
            return "Ambos son iguales";
        }

    }

}
