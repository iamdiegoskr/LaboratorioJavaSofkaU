package com.sofka.taller.ejercicios.ejercicio7;

import javax.swing.*;

public class NumberZero {

    public String  validateIfNumberIsZero(){

        int number = 0;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero por favor"));

        }while(number<0);

        return "El numero ingresado fue " + number;

    }

}
