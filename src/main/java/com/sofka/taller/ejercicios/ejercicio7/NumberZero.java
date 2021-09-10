package com.sofka.taller.ejercicios.ejercicio7;

import javax.swing.*;

public class NumberZero {

    public String  validateIfNumberIsZero(){

        int number = 0;

        try {
            do {
                number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero por favor"));

            }while(number<0);

        }catch (Exception e){
            JOptionPane.showMessageDialog (null,"Error inesperado", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

        return "El numero ingresado fue " + number;

    }

}
