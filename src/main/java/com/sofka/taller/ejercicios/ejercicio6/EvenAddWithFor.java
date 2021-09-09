package com.sofka.taller.ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class EvenAddWithFor {

    StringBuilder numberEven = new StringBuilder();
    StringBuilder numberOdd = new StringBuilder();

    public void isOddOrEven(){

        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                numberEven.append(i).append(" ");
            }else{
                numberOdd.append(i).append(" ");
            }
        }

    }

    public String getNumbersEven(){
        return numberEven.toString();
    }

    public String getNumberOdd(){
        return numberOdd.toString();
    }

}
