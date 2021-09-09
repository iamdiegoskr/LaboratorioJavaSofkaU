package com.sofka.taller.ejercicios.ejercicios1y2;

public class Numbers {

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
